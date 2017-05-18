package leetcode.no581_ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int[] sorted = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sorted);
		int begin = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != sorted[i]) {
				begin = i;
				break;
			}
		}
		if (begin == -1) {
			return 0;
		}
		int end = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] != sorted[i]) {
				end = i;
				break;
			}
		}
		return end - begin + 1;
	}

	public int findUnsortedSubarray2(int[] nums) {
		int[] toSmall = Arrays.copyOf(nums, nums.length);
		int[] toBig = Arrays.copyOf(nums, nums.length);
		int end = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (toBig[i] > toBig[i + 1]) {
				toBig[i + 1] = toBig[i];
				end = i + 1;
			}
		}
		if (end == 0) {
			return 0;
		}
		int start = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (toSmall[i] < toSmall[i - 1]) {
				toSmall[i - 1] = toSmall[i];
				start = i - 1;
			}
		}
		return end - start + 1;
	}
}
