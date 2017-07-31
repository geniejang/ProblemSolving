package euler.no018_MaximumPathSum1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int solve(int[][] nums) {
		int[] dp = Arrays.copyOf(nums[nums.length - 1], nums.length);
		for (int i = nums.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				dp[j] = nums[i][j] + Integer.max(dp[j], dp[j + 1]);
			}
		}
		return dp[0];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[][] nums = new int[n][];
			for (int i = 0; i < n; i++) {
				nums[i] = new int[i + 1];
				for (int j = 0; j <= i; j++) {
					nums[i][j] = in.nextInt();
				}
			}
			System.out.println(solve(nums));
		}
		in.close();
	}
}
