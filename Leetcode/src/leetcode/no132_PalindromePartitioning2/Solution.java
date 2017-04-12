package leetcode.no132_PalindromePartitioning2;

public class Solution {
	public int minCut(String s) {
		int n = s.length();
		int[] cut = new int[n];
		boolean[][] pal = new boolean[n][n];
		for (int r = 0; r < n; r++) {
			int min = r;
			for (int l = 0; l <= r; l++) {
				if (s.charAt(l) == s.charAt(r) && (l + 1 > r - 1 || pal[l + 1][r - 1])) {
					pal[l][r] = true;
					min = l == 0 ? 0 : Math.min(min, cut[l - 1] + 1);
				}
			}
			cut[r] = min;
		}

		return cut[n - 1];
	}
}
