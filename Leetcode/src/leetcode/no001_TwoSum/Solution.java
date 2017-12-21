package leetcode.no001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer smallIndex = map.get(target - nums[i]);
			if (smallIndex == null) {
				map.put(nums[i], i);
			} else {
				return new int[] { smallIndex, i };
			}
		}

		return null;
	}
}
