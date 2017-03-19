package leetcode.no416_PartitionEqualSubsetSum;

public class Solution {
	public boolean canPartition(int[] nums) {
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		int half = total / 2;
		if ((total & 1) == 1) {
			return false;
		}
		boolean[] dp = new boolean[half + 1];
		dp[0] = true;
		for (int num : nums) {
			for (int j = half; j >= num; j--) {
				dp[j] = dp[j] || dp[j - num];
			}
		}
		return dp[half];
	}
}
