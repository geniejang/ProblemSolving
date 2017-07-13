package euler.no004_LargestPalindromeProduct;

import java.util.Scanner;

public class Solution {
	private static boolean isPalindrome(int n) {
		int d0 = n % 10;
		int d1 = (n / 10) % 10;
		int d2 = (n / 100) % 10;
		int d3 = (n / 1000) % 10;
		int d4 = (n / 10000) % 10;
		int d5 = n / 100000;
		return d0 == d5 && d1 == d4 && d2 == d3;
	}

	public static int solve(int n) {
		int largest = 101101;
		for (int a = 101; a < 1000; a++) {
			for (int b = Integer.max(a, 100000 / a); b < 1000; b++) {
				int multiply = a * b;
				if (multiply >= n) {
					break;
				} else if (multiply > largest && isPalindrome(multiply)) {
					largest = multiply;
				}
			}
		}
		return largest;
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
