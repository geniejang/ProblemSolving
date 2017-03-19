package leetcode.no41_FirstMissingPositive;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		for (int i = 0; i < nums.length;) {
			int num = nums[i];
			if (num == i + 1 || num <= 0 || num > nums.length || nums[num - 1] == num) {
				i++;
			} else {
				int temp = nums[num - 1];
				nums[num - 1] = nums[i];
				nums[i] = temp;
			}
		}
		int missed = 0;
		while (missed < nums.length && nums[missed] == missed + 1) {
			missed++;
		}
		return missed + 1;
	}
}
