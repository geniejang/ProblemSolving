package euler.no017_NumberToWords;

import java.util.Scanner;

public class Solution {
	private static final String[] u20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	private static final String[] kilos = { "", "Thousand", "Million", "Billion", "Trillion" };

	public static String solve(long n) {
		StringBuilder sb = new StringBuilder();
		for (int k = 4; k >= 0; k--) {
			int trio = (int) ((n / Math.pow(1000, k)) % 1000);
			if (trio > 0) {
				if (sb.length() > 0) {
					sb.append(" ");
				}
				int hundred = trio / 100;
				if (hundred > 0) {
					sb.append(u20[hundred]);
					sb.append(" ");
					sb.append("Hundred");
				}
				int duo = trio % 100;
				if (duo > 0) {
					if (hundred > 0) {
						sb.append(" ");
					}
					if (duo >= 20) {
						sb.append(tens[duo / 10]);
						int unit = duo % 10;
						if (unit > 0) {
							sb.append(" ");
							sb.append(u20[unit]);
						}
					} else {
						sb.append(u20[duo]);
					}
				}
				if (k > 0) {
					sb.append(" ");
					sb.append(kilos[k]);
				}
			}
		}
		return sb.length() > 0 ? sb.toString() : "Zero";
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
