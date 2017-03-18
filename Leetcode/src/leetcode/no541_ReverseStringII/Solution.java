package leetcode.no541_ReverseStringII;

public class Solution {
	public String reverseStr(String s, int k) {
		int len = s.length();
		StringBuilder builder = new StringBuilder(len);
		for (int i = 0; i < len; i += k + k) {
			for (int j = Integer.min(i + k, len) - 1; j >= i; j--) {
				builder.append(s.charAt(j));
			}
			for (int j = i + k; j < Integer.min(i + k + k, len); j++) {
				builder.append(s.charAt(j));
			}
		}
		return builder.toString();
	}
}
