package leetcode.no525_ContiguousArray;

import java.util.HashMap;

public class Solution {
	public int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> startIdx = new HashMap<>();
		int accum = 0;
		int maxLen = 0;
		startIdx.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			accum += nums[i] == 0 ? -1 : 1;
			if (startIdx.containsKey(accum))
				maxLen = Math.max(maxLen, i - startIdx.get(accum));
			else
				startIdx.put(accum, i);
		}
		return maxLen;
	}
}
