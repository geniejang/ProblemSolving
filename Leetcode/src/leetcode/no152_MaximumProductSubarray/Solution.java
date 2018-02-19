package leetcode.no152_MaximumProductSubarray;

public class Solution {
	public int maxProduct(int[] nums) {
		int max = nums[0];
		int iMin = nums[0];
		int iMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < 0) {
				iMin ^= iMax;
				iMax ^= iMin;
				iMin ^= iMax;
			}
			iMax = Integer.max(nums[i], iMax * nums[i]);
			iMin = Integer.min(nums[i], iMin * nums[i]);
			max = Integer.max(max, iMax);
		}
		return max;
	}
}
