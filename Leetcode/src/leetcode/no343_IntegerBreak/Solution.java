package leetcode.no343_IntegerBreak;

public class Solution {
	public int integerBreak(int n) {
		int[] dp = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			for (int l = 1, r = i - 1; l <= r; l++, r--) {
				dp[i] = Integer.max(dp[i], Integer.max(dp[l], l) * Integer.max(dp[r], r));
			}
		}
		return dp[n];
	}

	public int integerBreak2(int n) {
		if (n < 4)
			return n - 1;
		int product = (int) Math.pow(3, n / 3);
		if (n % 3 == 1) {
			product = (product / 3) << 2;
		} else if (n % 3 == 2) {
			product *= 2;
		}
		return product;
	}
}
