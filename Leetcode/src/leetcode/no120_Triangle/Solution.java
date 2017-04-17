package leetcode.no120_Triangle;

import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0) {
			return 0;
		}
		int[] dp = new int[triangle.size() + 1];
		for (int r = triangle.size() - 1; r >= 0; r--) {
			List<Integer> row = triangle.get(r);
			for (int c = 0; c < row.size(); c++) {
				dp[c] = row.get(c) + Integer.min(dp[c], dp[c + 1]);
			}
		}
		return dp[0];
	}
}
