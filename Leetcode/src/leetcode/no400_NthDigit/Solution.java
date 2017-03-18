package leetcode.no400_NthDigit;

public class Solution {
	public int findNthDigit(int n) {
		n--;
		int digits = 1;
		long nums = 9;
		while (digits * nums <= n) {
			n -= digits * nums;
			digits += 1;
			nums *= 10;
		}
		int num = (int) Math.pow(10, digits - 1) + n / digits;
		n %= digits;
		return (int) (num / Math.pow(10, digits - n - 1)) % 10;
	}
}
