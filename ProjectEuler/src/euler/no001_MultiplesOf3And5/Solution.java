package euler.no001_MultiplesOf3And5;

import java.util.Scanner;

public class Solution {
	public static long sigma(int n) {
		return (long) n * (n + 1) / 2;
	}

	public static long solve(int num) {
		return 3 * sigma(--num / 3) + 5 * sigma(num / 5) - 15 * sigma(num / 15);
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
