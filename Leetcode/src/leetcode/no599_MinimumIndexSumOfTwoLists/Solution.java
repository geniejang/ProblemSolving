package leetcode.no599_MinimumIndexSumOfTwoLists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> common = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < list2.length; i++) {
			Integer idx = map.get(list2[i]);
			if (idx != null) {
				int newSum = idx + i;
				if (newSum == minSum) {
					common.add(list2[i]);
				}
				if (newSum < minSum) {
					minSum = newSum;
					common.clear();
					common.add(list2[i]);
				}
			}
		}
		return common.toArray(new String[common.size()]);
	}
}
