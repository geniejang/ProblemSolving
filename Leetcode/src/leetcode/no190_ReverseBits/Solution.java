package leetcode.no190_ReverseBits;

public class Solution {
	private static final int BITS = Integer.BYTES << 3;

	public int reverseBits(int n) {
		int reverse = 0;
		for (int i = 0; i < BITS; i++) {
			int mask = 1 << i;
			if ((n & mask) == mask) {
				reverse |= 1 << (BITS - i - 1);
			}
		}
		return reverse;
	}

	private static final int[] REVERSED_F = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

	public int reverseBits2(int n) {
		int reverse = 0;
		for (int i = 0; i < BITS; i += 4) {
			reverse |= REVERSED_F[(n >> i) & 0xf] << (BITS - i - 4);
		}
		return reverse;
	}
}
