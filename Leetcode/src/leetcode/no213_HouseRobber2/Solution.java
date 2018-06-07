package leetcode.no213_HouseRobber2;

public class Solution {
	private int rob(int[] nums, int l, int r) {
		int prevBefore = 0;
		int prev = 0;
		for (int i = l; i < r; i++) {
			int curr = Integer.max(prevBefore + nums[i], prev);
			prevBefore = prev;
			prev = curr;
		}
		return prev;
	}

	public int rob(int[] nums) {
		return nums.length == 1 ? nums[0] : Integer.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
	}
}
