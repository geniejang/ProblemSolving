package euler.no003_LargestPrimeFactor;

import java.util.Scanner;

public class Solution {
	public static long solve(long n) {
		long i = 2;
		while (i * i <= n) {
			if ((n % i) == 0) {
				while ((n % i) == 0) {
					n /= i;
				}
			} else {
				i++;
			}
		}
		return Long.max(i, n);
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
