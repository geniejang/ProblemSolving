package leetcode.no384_ShuffleAnArray;

import java.util.Arrays;
import java.util.Random;

public class Solution {

	private int[] nums;
	private int[] shuffled;

	public Solution(int[] nums) {
		this.nums = nums;
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return nums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		Random random = new Random();
		shuffled = Arrays.copyOf(nums, nums.length);
		for (int i = 0; i < nums.length; i++) {
			int rand = i + random.nextInt(nums.length - i);
			if (rand != i) {
				int temp = shuffled[i];
				shuffled[i] = shuffled[rand];
				shuffled[rand] = temp;
			}
		}
		return shuffled;
	}

}
