package leetcode.no532_KDiffPairsInAnArray;

import java.util.Arrays;

public class Solution {
	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length < 2)
			return 0;
		Arrays.sort(nums);
		int count = 0;
		int i = 0;
		int j = 1;
		int prevSmall = Integer.MIN_VALUE;
		while (j < nums.length) {
			int diff = nums[j] - nums[i];
			if (k == diff && prevSmall != nums[i]) {
				count++;
				prevSmall = nums[i];
			}
			if (k >= diff) {
				j++;
			}
			if (k <= diff) {
				i++;
			}
			if (i == j) {
				j++;
			}
		}
		return count;
	}
}
