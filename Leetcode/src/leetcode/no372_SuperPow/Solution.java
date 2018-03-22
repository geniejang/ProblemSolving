package leetcode.no372_SuperPow;

public class Solution {
	private static final int MOD = 1337;

	public int superPow(int a, int[] b) {
		int pow = 1;
		int base = a % MOD;
		for (int i = b.length - 1; i >= 0; i--) {
			for (int e = 0; e < b[i]; e++) {
				pow = (pow * base) % MOD;
			}
			base = (((((base * base) % MOD) * ((base * base) % MOD)) % MOD) * base) % MOD;
			base = (base * base) % MOD;
		}
		return pow;
	}
}
