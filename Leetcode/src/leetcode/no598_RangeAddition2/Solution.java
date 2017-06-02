package leetcode.no598_RangeAddition2;

public class Solution {
	public int maxCount(int m, int n, int[][] ops) {
		int minM = m;
		int minN = n;
		for (int[] op : ops) {
			minM = Integer.min(minM, op[0]);
			minN = Integer.min(minN, op[1]);
		}
		return minM * minN;
	}
}
