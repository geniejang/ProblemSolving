package leetcode.no029_DivideTwoIntegers;

public class Solution {
	public int divide(int dividend, int divisor) {
		if (divisor == 0) {
			return Integer.MAX_VALUE;
		}
		if (dividend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}
		boolean diffSign = dividend > 0 ^ divisor > 0;
		dividend = dividend > 0 ? -dividend : dividend;
		divisor = divisor > 0 ? -divisor : divisor;
		if (dividend > divisor) {
			return 0;
		}
		int sum = 0;
		int q = 1;
		while (divisor << 1 < 0 && q << 1 > 0) {
			divisor <<= 1;
			q <<= 1;
		}
		while (dividend < 0 && q > 0) {
			if (dividend - divisor <= 0) {
				dividend -= divisor;
				sum -= q;
			}
			divisor >>= 1;
			q >>= 1;
		}
		return diffSign ? sum : -sum;
	}
}
