package euler.no015_LatticePaths;

import java.util.Scanner;

public class Solution {
	public static int solve(int n, int m) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 0; i <= m; i++) {
			for (int j = 1; j < dp.length; j++) {
				dp[j] = (dp[j] + dp[j - 1]) % 1000000007;
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(solve(n, m));
		}
		in.close();
	}
}
