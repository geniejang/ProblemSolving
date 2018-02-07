package leetcode.no313_SuperUglyNumber;

import java.util.Arrays;

public class Solution {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		int[] mins = Arrays.copyOf(primes, primes.length);
		int[] indicies = new int[mins.length];
		for (int i = 1; i < n; i++) {
			uglyNumbers[i] = Integer.MAX_VALUE;
			for (int min : mins) {
				uglyNumbers[i] = Integer.min(uglyNumbers[i], min);
			}
			for (int j = 0; j < mins.length; j++) {
				if (uglyNumbers[i] == mins[j]) {
					mins[j] = primes[j] * uglyNumbers[++indicies[j]];
				}
			}
		}
		return uglyNumbers[n - 1];
	}
}
