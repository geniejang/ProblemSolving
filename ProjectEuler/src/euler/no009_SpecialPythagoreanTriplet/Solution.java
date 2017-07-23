package euler.no009_SpecialPythagoreanTriplet;

import java.util.Scanner;

public class Solution {
	public static int solve(int n) {
		for (int a = n / 3; a > 2; a--) {
			int child = n * (n - 2 * a);
			int parent = 2 * (n - a);
			if (child % parent == 0) {
				int b = child / parent;
				if (a < b) {
					int c = n - a - b;
					return a * b * c;
				}
			}
		}
		return -1;
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
