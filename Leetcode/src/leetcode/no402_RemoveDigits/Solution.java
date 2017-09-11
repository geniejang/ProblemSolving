package leetcode.no402_RemoveDigits;

public class Solution {
	public String removeKdigits(String num, int k) {
		if (num.length() == k) {
			return "0";
		}
		char[] reduced = new char[num.length() - k];
		int j = 0;
		char[] s = num.toCharArray();
		for (int i = 0; i < s.length; i++) {
			while (j > 0 && reduced[j - 1] > s[i] && s.length - i > reduced.length - j) {
				j--;
			}
			if (j < reduced.length) {
				reduced[j++] = s[i];
			}
		}
		int zeroes = -1;
		while (++zeroes < reduced.length - 1) {
			if (reduced[zeroes] != '0') {
				break;
			}
		}
		return String.copyValueOf(reduced, zeroes, reduced.length - zeroes);
	}
}
