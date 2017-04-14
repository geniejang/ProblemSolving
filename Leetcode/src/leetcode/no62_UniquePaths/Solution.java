package leetcode.no62_UniquePaths;

import java.util.Arrays;

public class Solution {
	public int uniquePaths(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		if (m > n) {
			return uniquePaths(n, m);
		}
		int[] paths = new int[n];
		Arrays.fill(paths, 1);
		for (int r = 1; r < m; r++) {
			for (int c = 1; c < n; c++) {
				paths[c] += paths[c - 1];
			}
		}
		return paths[n - 1];
	}

}
