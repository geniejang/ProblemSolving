package euler;

import java.util.Scanner;

public class Solution {
	public static int solve(int num) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
//			long n = in.nextLong();
			System.out.println(solve(n));
		}
		in.close();
	}
}
