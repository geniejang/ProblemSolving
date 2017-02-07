package leetcode.no459_RepeatedSubstringPattern;

public class Solution {
	private boolean isRepeated(String str, int len) {
		if (str.length() == len)
			return false;
		for (int i = len; i < str.length(); i++)
			if (str.charAt(i) != str.charAt(i % len))
				return false;
		return true;
	}

	public boolean repeatedSubstringPattern(String str) {
		for (int i = 1; i * i <= str.length(); i++) {
			if (str.length() % i > 0)
				continue;
			if (isRepeated(str, i))
				return true;
			if (isRepeated(str, str.length() / i))
				return true;
		}
		return false;
	}
}
