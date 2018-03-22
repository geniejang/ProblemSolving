package leetcode.no638_ShoppingOffers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
	public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
		int N = 0;
		int[][] S = new int[special.size()][2];
		for (int i = 0; i < needs.size(); i++) {
			N += needs.get(i) << (i << 2);
		}
		for (int i = 0; i < special.size(); i++) {
			List<Integer> s = special.get(i);
			for (int j = 0; j < s.size() - 1; j++) {
				S[i][0] += s.get(j) << (j << 2);
			}
			S[i][1] = s.get(s.size() - 1);
		}
		int minCost = Integer.MAX_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		Queue<int[]> pq = new LinkedList<>();
		pq.offer(new int[] { 0, 0 });
		while (!pq.isEmpty()) {
			int[] curr = pq.poll();
			map.put(curr[0], curr[1]);
			for (int[] s : S) {
				int buy = curr[0] + s[0];
				int cost = curr[1] + s[1];
				if (inNeeds(buy, N)) {
					pq.offer(new int[] { buy, cost });
				}
			}
			int n = curr[0];
			int cost = curr[1];
			for (int i = 0; i < needs.size(); i++) {
				cost += (needs.get(i) - ((n >> (i << 2)) & 0xf)) * price.get(i);
			}
			minCost = Integer.min(minCost, cost);
		}
		return minCost;
	}

	private boolean inNeeds(int actual, int needs) {
		int mask = 0xf;
		for (int i = 0; i < 6; i++) {
			if ((actual & mask) > (needs & mask)) {
				return false;
			}
			mask <<= 4;
		}
		return true;
	}
}
