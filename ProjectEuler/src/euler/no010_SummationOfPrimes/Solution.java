package euler.no010_SummationOfPrimes;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
	private static long[] sums;

	static {
		final int CEIL = 1000000 + 1;
		BitSet seive = new BitSet(CEIL);
		sums = new long[CEIL];
		sums[2] = 2;
		int sqrt = (int) Math.sqrt(CEIL);
		for (int i = 3; i < CEIL; i++) {
			sums[i] = sums[i - 1];
			if ((i & 1) == 1 && !seive.get(i)) {
				sums[i] += i;
				if (i <= sqrt) {
					int i2 = i + i;
					for (int j = i * i; j < CEIL; j += i2) {
						seive.set(j);
					}
				}
			}
		}
	}

	public static long solve(int n) {
		return sums[n];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(solve(n));
		}
		in.close();
	}
}
