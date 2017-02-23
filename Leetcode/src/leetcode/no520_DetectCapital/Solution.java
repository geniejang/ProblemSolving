package leetcode.no520_DetectCapital;

public class Solution {
	public boolean detectCapitalUse2(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				count++;
			}
		}
		return count == 0 || count == word.length()
			|| (count == 1 && Character.isUpperCase(word.charAt(0)));
	}

	public boolean detectCapitalUse(String word) {
		boolean upper = false;
		if (word.length() > 1) {
			if (Character.isUpperCase(word.charAt(0)))
				upper = Character.isUpperCase(word.charAt(1));
			else if (Character.isUpperCase(word.charAt(1)))
				return false;
		}
		for (int i = 2; i < word.length(); i++) {
			if (upper != Character.isUpperCase(word.charAt(i)))
				return false;
		}
		return true;
	}
}
