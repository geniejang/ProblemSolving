package leetcode.no044_WildcardMatching;

public class Solution {
	public boolean isMatch(String s, String p) {
		int i = 0;
		int j = 0;
		int match = 0;
		int aestarisk = -1;
		while (i < s.length()) {
			if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
				i++;
				j++;
			} else if (j < p.length() && p.charAt(j) == '*') {
				aestarisk = j++;
				match = i;
			} else if (aestarisk != -1) {
				j = aestarisk + 1;
				i = ++match;
			} else {
				return false;
			}
		}
		while (j < p.length() && p.charAt(j) == '*') {
			j++;
		}
		return j == p.length();
	}
}
