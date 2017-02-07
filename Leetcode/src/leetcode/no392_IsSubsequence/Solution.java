package leetcode.no392_IsSubsequence;

public class Solution {
	public boolean isSubsequence(String s, String t) {
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			while (idx < t.length() && c != t.charAt(idx))
				idx++;
			if (idx == t.length())
				return false;
			idx++;
		}
		return true;
	}
}
