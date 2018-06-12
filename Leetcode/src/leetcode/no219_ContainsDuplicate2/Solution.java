package leetcode.no219_ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>(k);
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
			if (i >= k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}
}
