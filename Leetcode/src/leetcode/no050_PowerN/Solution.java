package leetcode.no050_PowerN;

public class Solution {
	public double myPow(double x, int n) {
		double pow = 1;
		long exp = n > 0 ? n : (-(long) n);
		while (exp > 0) {
			if ((exp & 1) == 1) {
				pow *= x;
			}
			exp >>= 1;
			x *= x;
		}
		return n < 0 ? 1 / pow : pow;
	}
}
