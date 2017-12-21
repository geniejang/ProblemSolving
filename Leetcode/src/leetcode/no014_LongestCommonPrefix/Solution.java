package leetcode.no014_LongestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (String str : strs) {
				if (str.length() <= i || c != str.charAt(i)) {
					return str.substring(0, i);
				}
			}
		}
		return strs[0];
	}
}
