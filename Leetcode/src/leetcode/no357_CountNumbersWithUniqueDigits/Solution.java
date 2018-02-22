package leetcode.no357_CountNumbersWithUniqueDigits;

public class Solution {
	/**
	 * the function pmt() below means permutation.
	 * f(0) = 1
	 * f(n) = f(n-1) + pmt(10, n) - pmt(9, n-1)
	 * = f(n-1) + 10*pmt(9, n-1) - pmt(9, n-1)
	 * = f(n-1) + 9*pmt(9, n-1) // 1 <= n <= 10
	 * f(n') = f(10) // n > 10
	 */
	public int countNumbersWithUniqueDigits(int n) {
		int fn = 1; // f(0)
		int num = 10;
		int pmt9 = 9; // 9 * pmt(9, 0) : Multiply 9 here to avoid the same operation on each iterations
		for (int i = Integer.min(10, n); i > 0; i--) {
			fn += pmt9;
			pmt9 *= --num;
		}
		return fn;
	}
}
