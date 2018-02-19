package leetcode.no647_PalindromicSubstrings;

public class Solution {
	public int countSubstrings(String s) {
		char[] str = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += expandingPalindrome(str, i, 0);
			count += expandingPalindrome(str, i, 1);
		}
		return count;
	}

	private int expandingPalindrome(char[] str, int c, int offset) {
		int count = 0;
		for (int j = 0; c - j >= 0 && c + offset + j < str.length && str[c - j] == str[c + offset + j]; j++) {
			count++;
		}
		return count;
	}
}
