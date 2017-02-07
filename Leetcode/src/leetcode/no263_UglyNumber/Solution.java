package leetcode.no263_UglyNumber;

public class Solution {
	private static final int[] DIVISORS = { 2, 3, 5 };

	public boolean isUgly(int num) {
		if (num < 1)
			return false;
		for (int divisor : DIVISORS)
			while (num % divisor == 0)
				num /= divisor;
		return num == 1;
	}
}
