package leetcode.no300_LongestInscreasingSubsequence;

public class Solution {
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = 0;
		int[] dp = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && dp[j] >= dp[i]) {
					dp[i] = dp[j] + 1;
					max = Integer.max(max, dp[i]);
				}
			}
		}
		return max + 1;
	}
}
