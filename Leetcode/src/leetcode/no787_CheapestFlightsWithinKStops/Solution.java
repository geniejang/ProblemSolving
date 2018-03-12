package leetcode.no787_CheapestFlightsWithinKStops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		Map<Integer, List<int[]>> map = new HashMap<>();
		for (int[] flight : flights) {
			List<int[]> from = map.get(flight[0]);
			if (from == null) {
				from = new ArrayList<>();
				map.put(flight[0], from);
			}
			from.add(flight);
		}
		int[] minCosts = new int[n];
		Arrays.fill(minCosts, Integer.MAX_VALUE);
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { src, 0 });
		for (int k = -1; k <= K; k++) {
			for (int i = q.size(); i > 0; i--) {
				int[] here = q.poll();
				if (minCosts[here[0]] < here[1]) {
					continue;
				}
				minCosts[here[0]] = here[1];
				for (int[] flight : map.getOrDefault(here[0], Collections.emptyList())) {
					q.offer(new int[] { flight[1], here[1] + flight[2] });
				}
			}
		}
		return minCosts[dst] == Integer.MAX_VALUE ? -1 : minCosts[dst];
	}
}
