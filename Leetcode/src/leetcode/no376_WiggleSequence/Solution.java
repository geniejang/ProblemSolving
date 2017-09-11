package leetcode.no376_WiggleSequence;

public class Solution {
	public int wiggleMaxLength(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}
		int count = nums.length;
		int prevDiff = 0;
		for (int i = 1; i < nums.length; i++) {
			int diff = nums[i] - nums[i - 1];
			if (diff == 0) {
				count--;
			} else {
				if (prevDiff != 0 && diff * prevDiff >= 0) {
					count--;
				}
				prevDiff = diff;
			}
		}
		return count;
	}
}
