package leetcode.no153_FindMinimumInRotatedSortedArray;

public class Solution {
	public int findMin(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		while (l < r) {
			int p = (l + r) >> 1;
			if (nums[p] < nums[r]) {
				r = p;
			} else {
				l = p + 1;
			}
		}
		return nums[l];
	}
}
