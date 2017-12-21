package leetcode.no005_LongestPalindromeSubstring;

public class Solution {
	public String longestPalindrome(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];
		int longest = 0;
		int left = 0;
		int right = 0;
		for (int r = 0; r < s.length(); r++) {
			for (int l = 0; l <= r; l++) {
				if (s.charAt(l) == s.charAt(r) && (l + 1 > r - 1 || dp[l + 1][r - 1])) {
					dp[l][r] = true;
					if (longest < r - l + 1) {
						longest = r - l + 1;
						left = l;
						right = r;
					}
				}
			}
		}
		return s.substring(left, right + 1);
	}
}
