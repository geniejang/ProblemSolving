package leetcode.no151_ReverseWordsInString;

public class Solution {
	private void appendWord(String s, StringBuilder sb, int start, int end) {
		if (sb.length() > 0) {
			sb.append(' ');
		}
		for (int j = start; j < end; j++) {
			sb.append(s.charAt(j));
		}
	}

	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int end = s.length();
		for (int i = s.length(); i > 0; i--) {
			if (s.charAt(i - 1) == ' ') {
				if (i < end) {
					appendWord(s, sb, i, end);
				}
				end = i - 1;
			}
		}
		if (end > 0) {
			appendWord(s, sb, 0, end);
		}
		return sb.toString();
	}
}
