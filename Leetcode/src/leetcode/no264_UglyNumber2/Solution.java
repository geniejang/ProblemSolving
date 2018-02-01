package leetcode.no264_UglyNumber2;

public class Solution {
	private static final int[] FACTORS = { 2, 3, 5 };

	public int nthUglyNumber(int n) {
		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		int[] indicies = new int[3];
		int[] mins = { 2, 3, 5 };
		for (int i = 1; i < n; i++) {
			uglyNumbers[i] = Integer.min(mins[0], Integer.min(mins[1], mins[2]));
			for (int j = 0; j < mins.length; j++) {
				if (mins[j] == uglyNumbers[i]) {
					mins[j] = FACTORS[j] * uglyNumbers[++indicies[j]];
				}
			}
		}
		return uglyNumbers[uglyNumbers.length - 1];
	}
}
