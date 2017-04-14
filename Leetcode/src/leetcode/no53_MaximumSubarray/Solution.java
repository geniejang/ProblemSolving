package leetcode.no53_MaximumSubarray;

public class Solution {
	public int maxSubArrayWithDP(int[] nums) {
		int[] sum = new int[nums.length];
		int max = sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = nums[i] + (sum[i - 1] < 0 ? 0 : sum[i - 1]);
			max = Integer.max(max, sum[i]);
		}
		return max;
	}

	public int maxSubArray(int[] nums) {
		int sum = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = nums[i] + (sum < 0 ? 0 : sum);
			max = Integer.max(max, sum);
		}
		return max;
	}
}
