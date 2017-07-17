package euler.no008_LargestProductInSeries;

import java.util.Scanner;

public class Solution {
	private static int parseDigit(String s, int i) {
		return s.charAt(i) - '0';
	}

	public static int solve(String num, int n, int k) {
		int largest = 0;
		int s = 0;
		int i = 0;
		int product = 1;
		while (i < n) {
			int digit = parseDigit(num, i);
			if (digit == 0) {
				s = ++i;
				product = 1;
			} else {
				product *= digit;
				if (i - s == k) {
					product /= parseDigit(num, s++);
				}
				if (i - s == k - 1) {
					largest = Integer.max(largest, product);
				}
				i++;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			String num = in.next();
			System.out.println(solve(num, n, k));
		}
		in.close();
	}
}
