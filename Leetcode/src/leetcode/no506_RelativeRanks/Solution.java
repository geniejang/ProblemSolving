package leetcode.no506_RelativeRanks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static final String[] MEDALS = { "Gold Medal", "Silver Medal", "Bronze Medal" };

	public String[] findRelativeRanks(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			map.put(nums[i], i);
		Arrays.sort(nums);
		String[] ranks = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int rank = nums.length - i - 1;
			int index = map.get(nums[i]);
			ranks[index] = rank < 3 ? MEDALS[rank] : String.valueOf(rank + 1);
		}
		return ranks;
	}
}
