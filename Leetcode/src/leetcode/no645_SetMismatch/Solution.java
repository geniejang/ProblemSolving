package leetcode.no645_SetMismatch;

import java.util.BitSet;

public class Solution {
	public int[] findErrorNums(int[] nums) {
		int[] errors = new int[2];
		BitSet flags = new BitSet(nums.length + 1);
		for (int i = 0; i < nums.length; i++) {
			if (!flags.get(nums[i])) {
				flags.set(nums[i]);
			} else {
				errors[0] = nums[i];
			}
		}
		errors[1] = flags.nextClearBit(1);
		return errors;
	}
}
