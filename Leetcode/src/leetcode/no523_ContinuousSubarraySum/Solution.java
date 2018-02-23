package leetcode.no523_ContinuousSubarraySum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean checkSubarraySum(int[] nums, int k) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		if (k == 0) {
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] == 0 && nums[i - 1] == 0) {
					return true;
				}
			}
			return false;
		}
		if (k < 0) {
			k *= -1;
		}
		int[] psum = new int[nums.length + 1];
		for (int i = 1; i < psum.length; i++) {
			psum[i] = (psum[i - 1] + nums[i - 1]) % k;
		}
		for (int i = 2; i < psum.length; i++) {
			for (int j = i - 2; j >= 0; j--) {
				if (psum[i] == psum[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkSubarraySum2(int[] nums, int k) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>(nums.length + 1);
		map.put(0, -1);
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			runningSum += nums[i];
			if (k != 0) {
				runningSum %= k;
			}
			Integer prev = map.get(runningSum);
			if (prev == null) {
				map.put(runningSum, i);
			} else if (i - prev > 1) {
				return true;
			}
		}
		return false;
	}
}
