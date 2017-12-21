package leetcode.no016_3SumClosest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3) {
			return -1;
		}
		Arrays.sort(nums);
		int closest = Integer.MAX_VALUE;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			int threeSum = nums[i] + nums[l] + nums[r];
			while (l < r) {
				if (threeSum == target) {
					return threeSum;
				}
				int newDiff = Integer.max(target - threeSum, threeSum - target);
				if (newDiff < diff) {
					closest = threeSum;
					diff = newDiff;
				}
				if (threeSum < target) {
					threeSum -= nums[l];
					do {
						l++;
					} while (l < r && nums[l - 1] == nums[l]);
					threeSum += nums[l];
				}
				if (threeSum > target) {
					threeSum -= nums[r];
					do {
						r--;
					} while (l < r && nums[r] == nums[r + 1]);
					threeSum += nums[r];
				}
			}
			while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
				i++;
			}
		}
		return closest;
	}
}
