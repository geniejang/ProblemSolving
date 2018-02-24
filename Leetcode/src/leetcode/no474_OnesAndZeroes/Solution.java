package leetcode.no474_OnesAndZeroes;

public class Solution {
	public int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];
		int[] cnt = new int[2];
		for (String s : strs) {
			cnt[0] = cnt[1] = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				cnt[s.charAt(i) - '0']++;
			}
			for (int zero = m; zero >= cnt[0]; zero--) {
				for (int one = n; one >= cnt[1]; one--) {
					dp[zero][one] = Integer.max(dp[zero][one], dp[zero - cnt[0]][one - cnt[1]] + 1);
				}
			}
		}
		return dp[m][n];
	}
}
