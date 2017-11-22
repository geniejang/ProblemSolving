package leetcode.no122_BestTimeToBuyAndSellStock2;

public class Solution {
	private static final int NA = Integer.MIN_VALUE;

	public int maxProfit(int[] prices) {
		int profit = 0;
		int buy = NA;
		for (int i = 0; i + 1 < prices.length; i++) {
			if (buy == NA && prices[i] < prices[i + 1]) {
				buy = prices[i];
			} else if (buy != NA && prices[i] > prices[i + 1]) {
				profit += prices[i] - buy;
				buy = NA;
			}
		}
		if (buy != NA) {
			profit += prices[prices.length - 1] - buy;
		}
		return profit;
	}
}
