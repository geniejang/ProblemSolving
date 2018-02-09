package leetcode.no033_SearchInRotatedSortedArray;

public class Solution {
	public int search(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int p = (l + r) / 2;
			if (nums[p] == target) {
				return p;
			}
			if (nums[p] < target) {
				if (nums[p] > nums[r] || target <= nums[r]) {
					l = p + 1;
				} else {
					r = p - 1;
				}
			} else {
				if (nums[p] < nums[l] || target >= nums[l]) {
					r = p - 1;
				} else {
					l = p + 1;
				}
			}
		}
		return -1;
	}
}
