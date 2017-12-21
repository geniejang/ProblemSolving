package leetcode.no055_JumpGame;

public class Solution {
	public boolean canJump(int[] nums) {
		int jump = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			jump++;
			if (nums[i] >= jump)
				jump = 0;
		}
		return jump == 0;
	}
}
