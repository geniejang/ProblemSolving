package euler.no028_NumberSpiralDiagonals;

import java.util.Scanner;

public class Solution {
	private static final int DIV = 1000000007;

	public static int mod(long n) {
		return (int) (n % DIV);
	}

	public static int solve(long n) {
		n %= DIV;
		final long INV_6 = 166666668;
		int val1 = mod(mod(mod(4 * n) * n) * n);
		int val2 = mod(mod(3 * n) * n);
		int val3 = mod(8 * n);
		return mod(mod(mod(mod(val1 + val2) + val3) + DIV - 9) * INV_6);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(solve(n));
		}
		in.close();
	}
}
