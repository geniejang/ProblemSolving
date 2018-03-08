package leetcode.no081_SearchInRotatedSortedArray2;

class Solution {
	public boolean search(int[] nums, int target) {
		int rot = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i-1]) {
				rot = i;
			}
		}
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int p = (l + r) / 2;
			int rp = (p + rot) % nums.length;
			if (nums[rp] == target) {
				return true;
			}
			if (nums[rp] < target) {
				l = p + 1;
			} else {
				r = p - 1;
			}
		}
		return false;
	}
}
