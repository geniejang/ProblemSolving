package leetcode.no713_SubarrayProductLessThanK;

public class Solution {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int count = 0;
		int product = 1;
		for (int l = -1, r = 0; r < nums.length; r++) {
			product *= nums[r];
			while (product >= k && l < r) {
				product /= nums[++l];
			}
			count += r - l;
		}
		return count;
	}
}
