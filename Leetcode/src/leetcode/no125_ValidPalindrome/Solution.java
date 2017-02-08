package leetcode.no125_ValidPalindrome;

public class Solution {
	public boolean isPalindrome(String s) {
		int forward = 0;
		int backward = s.length() - 1;
		while (forward < backward) {
			char ch1 = 0;
			while (forward < s.length()) {
				ch1 = s.charAt(forward);
				if (Character.isAlphabetic(ch1) || Character.isDigit(ch1))
					break;
				forward++;
			}
			char ch2 = 0;
			while (backward >= 0) {
				ch2 = s.charAt(backward);
				if (Character.isAlphabetic(ch2) || Character.isDigit(ch2))
					break;
				backward--;
			}
			if (forward < backward && Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
				return false;
			forward++;
			backward--;
		}

		return true;
	}
}
