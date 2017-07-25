package leetcode.no447_NumberOfBoomerangs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int numberOfBoomerangs(int[][] points) {
		int total = 0;
		Map<Integer, Integer> dist = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				int d = distance(points, i, j);
				dist.put(d, 1 + dist.getOrDefault(d, 0));
			}
			for (int d : dist.values()) {
				total += d * (d - 1);
			}
			dist.clear();
		}
		return total;
	}

	private int distance(int[][] points, int i, int j) {
		int dx = points[i][0] - points[j][0];
		int dy = points[i][1] - points[j][1];
		return dx * dx + dy * dy;
	}
}
