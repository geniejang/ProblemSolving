package leetcode.no747_LargestNumberAtLeastTwoOfOthers;

public class Solution {
	public int dominantIndex(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}
		int idx = 0;
		int no2 = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[idx]) {
				no2 = nums[idx];
				idx = i;
			} else if (nums[i] > no2) {
				no2 = nums[i];
			}
		}
		return nums[idx] >= no2 * 2 ? idx : -1;
	}
}
