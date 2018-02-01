package leetcode.no034_SearchForRange;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] range = { -1, -1 };
		if (nums == null || nums.length == 0) {
			return range;
		}
		range[0] = searchLeft(nums, target);
		range[1] = searchRight(nums, target);
		return range;
	}

	private int searchLeft(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int p = (l + r) / 2;
			if (p == 0 || nums[p - 1] < target) {
				if (nums[p] == target) {
					return p;
				} else if (nums[p] < target) {
					l = p + 1;
				} else if (p + 1 == nums.length || nums[p] > target) {
					return -1;
				}
			} else {
				r = p - 1;
			}
		}
		return -1;
	}

	private int searchRight(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int p = (l + r) / 2;
			if (p + 1 == nums.length || nums[p + 1] > target) {
				if (nums[p] == target) {
					return p;
				} else if (nums[p] > target) {
					r = p - 1;
				} else if (p == 0 || nums[p] < target) {
					return -1;
				}
			} else {
				l = p + 1;
			}
		}
		return -1;
	}
}
