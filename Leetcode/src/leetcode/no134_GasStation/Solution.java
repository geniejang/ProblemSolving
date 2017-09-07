package leetcode.no134_GasStation;

//import java.util.Arrays;

public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int gasTotal = 0;
		int costTotal = 0;
		for (int i = 0; i < gas.length; i++) {
			gasTotal += gas[i];
			costTotal += cost[i];
		}
		if (gasTotal < costTotal) {
			return -1;
		}
//		if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
//			return -1;
//		}
		int idx = 0;
		int remained = -1;
		while (remained < 0) {
			remained = 0;
			for (int move = 0; move < gas.length; move++) {
				int newIdx = (idx + move) % gas.length;
				remained += gas[newIdx];
				remained -= cost[newIdx];
				if (remained < 0) {
					idx += move + 1;
					break;
				}
			}
		}
		return idx;
	}
}
