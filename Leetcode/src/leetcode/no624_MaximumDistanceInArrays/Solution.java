package leetcode.no624_MaximumDistanceInArrays;

import java.util.List;

public class Solution {
	public int maxDistance(List<List<Integer>> arrays) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int minIdx = -1;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int maxIdx = -1;
		for (int i = 0; i < arrays.size(); i++) {
			List<Integer> arr = arrays.get(i);
			int val = arr.get(0);
			if (val < min1) {
				min2 = min1;
				min1 = val;
				minIdx = i;
			} else if (val < min2) {
				min2 = val;
			}
			val = arr.get(arr.size() - 1);
			if (val > max1) {
				max2 = max1;
				max1 = val;
				maxIdx = i;
			} else if (val > max2) {
				max2 = val;
			}
		}
		return minIdx != maxIdx ? max1 - min1 : Integer.max(max1 - min2, max2 - min1);
	}
}
