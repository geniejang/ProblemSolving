package leetcode.no752_OpenTheLock;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int openLock(String[] deadends, String target) {
		int dest = Integer.valueOf(target);
		if (dest == 0) {
			return 0;
		}
		boolean[] visited = new boolean[10000];
		for (String deadend : deadends) {
			visited[Integer.valueOf(deadend)] = true;
		}
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		for (int rot = 1; !q.isEmpty(); rot++) {
			for (int size = q.size(); size > 0; size--) {
				int curr = q.poll();
				if (visited[curr]) {
					continue;
				}
				visited[curr] = true;
				for (int unit = 1; unit <= 1000; unit *= 10) {
					int digit = (curr % (unit * 10)) / unit;
					int increased = curr + unit * (digit < 9 ? 1 : -9);
					int decreased = curr + unit * (digit > 0 ? -1 : 9);
					if (increased == dest || decreased == dest) {
						return rot;
					}
					if (!visited[increased]) {
						q.offer(increased);
					}
					if (!visited[decreased]) {
						q.offer(decreased);
					}
				}
			}
		}
		return -1;
	}
}
