package leetcode.no9_PalindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int reverse = 0;
		for (int buffer = x; buffer != 0; buffer /= 10) {
			reverse = reverse * 10 + (buffer % 10);
		}
		return x == reverse;
	}
}
