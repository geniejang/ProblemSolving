package euler.no007_10001stPrime;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	private static List<Integer> primes = new LinkedList<>();

	static {
		int ceil = 105000;
		BitSet seive = new BitSet(ceil);
		seive.flip(0, ceil);
		primes.add(2);
		int sqrt = (int) Math.sqrt(ceil);
		for (int i = 3; i <= ceil; i += 2) {
			if (seive.get(i)) {
				primes.add(i);
				if (i <= sqrt) {
					int i2 = i + i;
					for (int j = i * i; j < ceil; j += i2) {
						seive.clear(j);
					}
				}
			}
		}
	}

	public static int solve(int n) {
		return primes.get(n - 1);
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
