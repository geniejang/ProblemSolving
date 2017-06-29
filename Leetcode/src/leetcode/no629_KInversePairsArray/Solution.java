package leetcode.no629_KInversePairsArray;

public class Solution {
	private static final int DIVISOR = 1000000007;

	public int kInversePairs(int n, int k) {
		int[][] dp = new int[n][k + 1];
		dp[0][0] = 1;
		for (int i = 1; i < n; i++) {
			dp[i][0] = 1;
			for (int j = 1; j < k + 1; j++) {
				dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % DIVISOR;
				if (j > i) {
					dp[i][j] = (dp[i][j] + DIVISOR - dp[i - 1][j - i - 1]) % DIVISOR;
				}
			}
		}
		return dp[n - 1][k];
	}
}
