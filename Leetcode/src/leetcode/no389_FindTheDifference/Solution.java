package leetcode.no389_FindTheDifference;

public class Solution {
	public char findTheDifference(String s, String t) {
		char diff = t.charAt(s.length());
		for (int i = 0; i < s.length(); i++) {
			diff ^= s.charAt(i);
			diff ^= t.charAt(i);
		}
		return diff;
	}
}
