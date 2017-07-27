package euler.no014_LongestCollatzSequence;

import java.util.Scanner;

public class Solution {
	private static int[] dp = new int[5000001];
	private static int[] moves = new int[5000001];
	private static int top = 1;
	private static long longest = 0;

	static {
		dp[1] = 1;
	}

	public static int solve(int n) {
		while (top < n) {
			int count = 0;
			long i = ++top;
			while (i > 1) {
				i = (i & 1) == 0 ? (i / 2) : (i * 3 + 1);
				count++;
				if (i < moves.length && moves[(int) i] > 0) {
					count += moves[(int) i];
					break;
				}
			}
			moves[top] = count;
			if (count < longest) {
				dp[top] = dp[top - 1];
			} else {
				dp[top] = top;
				longest = count;
			}
		}
		return dp[n];
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
