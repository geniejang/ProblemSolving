package leetcode.no322_CoinChange;

public class Solution {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		for (int i = 1; i < dp.length; i++) {
			int min = dp.length;
			for (int coin : coins) {
				if (i >= coin) {
					int temp = dp[i - coin] + 1;
					min = Integer.min(min, temp);
				}
			}
			dp[i] = min;
		}

		return dp[amount] == dp.length ? -1 : dp[amount];
	}
}
