package leetcode.no338_CountingBits;

import java.util.Arrays;

public class Solution {
	public int[] countBits(int num) {
		int[] counts = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			counts[i] = counts[i >> 1] + (i & 1);
		}
		return counts;
	}

	public int[] countBits2(int num) {
		int[] counts = new int[num + 1];
		Arrays.setAll(counts, i -> counts[i >> 1] + (i & 1));
		return counts;
	}
}
