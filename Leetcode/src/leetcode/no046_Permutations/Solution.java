package leetcode.no046_Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> perm = new ArrayList<>(nums.length);
		buildPermutation(nums, perm, 0, list);
		return list;
	}

	private void buildPermutation(int[] nums, List<Integer> perm, int digit, List<List<Integer>> list) {
		if (digit == nums.length) {
			list.add(new ArrayList<>(perm));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (perm.contains(nums[i])) {
					continue;
				}
				perm.add(nums[i]);
				buildPermutation(nums, perm, digit + 1, list);
				perm.remove(perm.size() - 1);
			}
		}
	}
}
