package euler.no016_PowerDigitSum;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static int solve(int n) {
		String power = BigInteger.ONE.shiftLeft(n).toString();
		int sum = -power.length() * '0';
		for (char digit : power.toCharArray()) {
			sum += digit;
		}
		return sum;
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
