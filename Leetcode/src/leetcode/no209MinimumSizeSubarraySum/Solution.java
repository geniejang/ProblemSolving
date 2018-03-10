package leetcode.no209MinimumSizeSubarraySum;

public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int minSize = Integer.MAX_VALUE;
		for (int from = 0, to = 0, sum = 0; to < nums.length; to++) {
			sum += nums[to];
			while (sum >= s) {
				minSize = Integer.min(minSize, to - from + 1);
				sum -= nums[from++];
			}
		}
		return minSize == Integer.MAX_VALUE ? 0 : minSize;
	}
}
