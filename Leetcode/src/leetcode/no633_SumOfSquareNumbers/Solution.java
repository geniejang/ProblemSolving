package leetcode.no633_SumOfSquareNumbers;

public class Solution {
	public boolean judgeSquareSum(int c) {
		int sqrtHalf = (int) Math.sqrt(c / 2);
		for (int a = 0; a <= sqrtHalf; a++) {
			int bb = c - a * a;
			int b = (int) Math.sqrt(bb);
			if (b * b == bb) {
				return true;
			}
		}
		return false;
	}
}
