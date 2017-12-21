package leetcode.no015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[l], nums[r]));
				}
				if (sum <= 0) {
					do {
						l++;
					} while (l < r && nums[l - 1] == nums[l]);
				}
				if (sum >= 0) {
					do {
						r--;
					} while (l < r && nums[r] == nums[r + 1]);
				}
			}
			while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
				i++;
			}
		}
		return list;
	}
}
