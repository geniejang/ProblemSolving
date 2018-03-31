package leetcode.no045_JumpGame2;

public class Solution {
	public int jump(int[] nums) {
		int curr = 0;
		int next = 0;
		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > curr) {
				curr = next;
				steps++;
			}
			next = Integer.max(next, i + nums[i]);
		}
		return steps;
	}
}
