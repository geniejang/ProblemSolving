package leetcode.no594_LongestHarmoniousSubsequence;

import java.util.Arrays;

public class Solution {
	public int findLHS(int[] nums) {
		Arrays.sort(nums);
		int longest = 0;
		int left = 0;
		int right = 0;
		while (right < nums.length) {
			if (nums[left] == nums[right]) {
				right++;
			} else if (nums[left] + 1 == nums[right]) {
				longest = Integer.max(longest, right - left + 1);
				right++;
			} else {
				left++;
			}
		}
		return longest;
	}
}
