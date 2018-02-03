package leetcode.no516_LongestPalindromicSubsequence;

public class Solution {
	public int longestPalindromeSubseq(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int[][] dp = new int[s.length() + 1][s.length() + 1];
		for (int r = 0; r < s.length(); r++) {
			char inv = s.charAt(s.length() - r - 1);
			for (int c = 0; c < s.length(); c++) {
				if (inv == s.charAt(c)) {
					dp[r + 1][c + 1] = dp[r][c] + 1;
				} else {
					dp[r + 1][c + 1] = Integer.max(dp[r + 1][c], dp[r][c + 1]);
				}
			}
		}
		return dp[s.length()][s.length()];
	}
}
