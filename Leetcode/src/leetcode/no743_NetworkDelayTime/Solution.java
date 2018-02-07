package leetcode.no743_NetworkDelayTime;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public int networkDelayTime(int[][] times, int N, int K) {
		int[][] weights = new int[N + 1][N + 1];
		for (int i = 1; i < weights.length; i++) {
			Arrays.fill(weights[i], -1);
		}
		for (int[] time : times) {
			weights[time[0]][time[1]] = time[2];
		}
		boolean[] visited = new boolean[N + 1];
		int[] mins = new int[N + 1];
		Queue<int[]> nexts = new PriorityQueue<>((a, b) -> a[1] - b[1]); // {target, weight}
		visited[K] = true;
		nexts.add(new int[] { K, 0 });
		while (!nexts.isEmpty()) {
			int[] next = nexts.poll();
			for (int i = 1; i <= N; i++) {
				if (weights[next[0]][i] > -1) {
					if (!visited[i] || mins[next[0]] + weights[next[0]][i] < mins[i]) {
						visited[i] = true;
						mins[i] = mins[next[0]] + weights[next[0]][i];
						nexts.add(new int[] { i, mins[i] });
					}
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				return -1;
			}
			max = Integer.max(max, mins[i]);
		}
		return max;
	}
}
