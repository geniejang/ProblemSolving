package leetcode.no575_DistributeCandies;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (int num : candies) {
			set.add(num);
		}
		return Integer.min(set.size(), candies.length / 2);
	}
}
