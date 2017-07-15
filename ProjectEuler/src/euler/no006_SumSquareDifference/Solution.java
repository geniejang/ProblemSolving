package euler.no006_SumSquareDifference;

import java.util.Scanner;

public class Solution {
	public static long solve(long n) {
		return n * (n + 1) * (3 * n + 2) * (n - 1) / 12;
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
