package leetcode.no018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int len = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int a = 0; a < len - 3; a++) {
			if (nums[a] > 0 && nums[a] >= target) {
				break;
			}
			if (a > 0 && nums[a] == nums[a - 1]) {
				continue;
			}
			if (nums[a] + nums[a + 1] + nums[a + 2] + nums[a + 3] > target) {
				break;
			}
			if (nums[a] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) {
				continue;
			}
			for (int b = a + 1; b < len - 2; b++) {
				int ab = nums[a] + nums[b];
				if (nums[b] > 0 && ab >= target) {
					break;
				}
				if (b > a + 1 && nums[b] == nums[b - 1]) {
					continue;
				}
				if (ab + nums[b + 1] + nums[b + 2] > target) {
					break;
				}
				if (ab + nums[len - 2] + nums[len - 1] < target) {
					continue;
				}
				int l = b + 1;
				int r = len - 1;
				while (l < r) {
					int sum = ab + nums[l] + nums[r];
					if (sum == target) {
						List<Integer> quadruplet = Arrays.asList(nums[a], nums[b], nums[l], nums[r]);
						list.add(quadruplet);
					}
					if (sum <= target) {
						while (++l < r && nums[l] == nums[l - 1]) {
						}
					}
					if (sum >= target) {
						while (l < --r && nums[r] == nums[r + 1]) {
						}
					}
				}
			}
		}
		return list;
	}
}
