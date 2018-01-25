package euler.no031_CoinSums;

import java.util.Scanner;

public class Solution {
	static final int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
	static int[] dp = new int[100001];
	static final int MOD = 1000000007;

	static {
		dp[0] = 1;
		for (int coin : coins) {
			for (int i = coin; i < dp.length; i++) {
				dp[i] += dp[i - coin];
				dp[i] %= MOD;
			}
		}
	}

	public static int solve(int num) {
		return dp[num];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(solve(n));
		}
		in.close();
	}
}
