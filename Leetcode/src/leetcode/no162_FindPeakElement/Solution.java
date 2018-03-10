package leetcode.no162_FindPeakElement;

public class Solution {
	public int findPeakElement(int[] nums) {
		for (int i = 0; i + 1 < nums.length; i++) {
			if (nums[i] > nums[i + 1]) {
				return i;
			}
		}
		return nums.length - 1;
	}

	public int findPeakElementBS(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		while (l + 1 < r) {
			int p = l + ((r - l) >> 1);
			if (nums[p - 1] < nums[p] && nums[p] > nums[p + 1]) {
				return p;
			} else if (nums[p - 1] > nums[p]) {
				r = p - 1;
			} else {
				l = p + 1;
			}
		}
		return nums[l] > nums[r] ? l : r;
	}
}
