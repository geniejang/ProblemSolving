package euler.no012_HighlyDivisibleTriangularNumber;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	private static List<Integer> triangulars = new LinkedList<>();
	private static int sigma = 1;
	private static int top = 1;

	public static int countFactorsExcept1(int n) {
		int count = 1;
		int i = 2;
		while (n > 1) {
			int exp = 0;
			while (n % i == 0) {
				exp++;
				n /= i;
			}
			count *= exp + 1;
			i += i == 2 ? 1 : 2;
		}
		return count - 1;
	}

	public static int solve(int n) {
		while (triangulars.size() < n) {
			sigma += ++top;
			int factors = countFactorsExcept1(sigma);
			while (triangulars.size() < factors) {
				triangulars.add(sigma);
			}
		}
		return triangulars.get(n - 1);
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
