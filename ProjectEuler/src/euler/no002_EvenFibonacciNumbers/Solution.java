package euler.no002_EvenFibonacciNumbers;

import java.util.Scanner;

public class Solution {
	private static long[] fibo = new long[28];
	private static long[] accum = new long[28];

	static {
		fibo[0] = 0;
		fibo[1] = 2;
		accum[1] = fibo[1];
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = 4 * fibo[i - 1] + fibo[i - 2];
			accum[i] = accum[i - 1] + fibo[i];
		}
	}

	public static long solve(long num) {
		int i = fibo.length - 1;
		while (i >= 0 && fibo[i] > num) {
			i--;
		}
		return accum[i];
	}

	public static long solveWithoutCashing(long num) {
		long sum = 0;
		long fn = 2;
		long fn_3 = 0;
		long fn_6 = 0;
		while (fn <= num) {
			sum += fn;
			fn_6 = fn_3;
			fn_3 = fn;
			fn = 4 * fn_3 + fn_6;
		}
		return sum;
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
