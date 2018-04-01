package leetcode.no218_SkylineProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {
	public List<int[]> getSkyline(int[][] buildings) {
		List<int[]> skyline = new ArrayList<>(buildings.length);
		Map<Integer, List<int[]>> map = new TreeMap<>();
		for (int[] building : buildings) {
			map.putIfAbsent(building[0], new ArrayList<>());
			map.putIfAbsent(building[1], new ArrayList<>());
			map.get(building[0]).add(building);
			map.get(building[1]).add(building);
		}
		int height = 0;
		Queue<int[]> tops = new PriorityQueue<>(buildings.length, (a, b) -> b[2] - a[2]);
		for (Map.Entry<Integer, List<int[]>> e : map.entrySet()) {
			int x = e.getKey();
			for (int[] building : e.getValue()) {
				if (building[0] == x) {
					tops.add(building);
				} else {
					tops.remove(building);
				}
			}
			int newHeight = tops.isEmpty() ? 0 : tops.peek()[2];
			if (height != newHeight) {
				height = newHeight;
				skyline.add(new int[] { x, height });
			}
		}
		return skyline;
	}
}
