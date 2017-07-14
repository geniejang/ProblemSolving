package euler.no005_SmallestMultiple;

import java.util.Scanner;

public class Solution {
	private static long[] multiples = new long[41];
	private static int top;

	static {
		multiples[1] = 1;
		top = 1;
	}

	private static long euclideanGCD(long a, long b) {
		return b == 0 ? a : euclideanGCD(b, a % b);
	}

	public static long solveWithDp(int n) {
		if (top < n) {
			for (int i = top + 1; i <= n; i++) {
				long gcd = euclideanGCD(multiples[i - 1], i);
				multiples[i] = multiples[i - 1] * i / gcd;
			}
			top = n;
		}
		return multiples[n];
	}

	public static long solve(int n) {
		long multiple = 1;
		for (int i = 2; i <= n; i++) {
			long gcd = euclideanGCD(multiple, i);
			multiple = multiple * i / gcd;
		}
		return multiple;
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
