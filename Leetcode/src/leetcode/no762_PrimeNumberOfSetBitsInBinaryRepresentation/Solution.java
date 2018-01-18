package leetcode.no762_PrimeNumberOfSetBitsInBinaryRepresentation;

public class Solution {
	private static final boolean[] primes = {
			false, false, true, true, false, true, false, true, false, false,
			false, true, false, true, false, false, false, true, false, true,
			false, false, false, true, false, false, false, false, false, true
	};

	public int countPrimeSetBits(int L, int R) {
		int count = 0;
		for (int i = L; i <= R; i++) {
			int bits = 0;
			for (int d = i; d > 0; d >>= 1) {
				bits += d & 1;
			}
			if (primes[bits]) {
				count++;
			}
		}
		return count;
	}
}
