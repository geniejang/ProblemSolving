package leetcode.no423_ReconstructOriginalDigitsFromEnglish;

public class Solution {
	private static char[] symbols = { 'z', 'o', 'w', 'h', 'u', 'f', 'x', 's', 'g', 'i' };
	private static char[][] redundants = { { 'o' }, {}, { 'o' }, {}, { 'f', 'o' }, { 'i' }, { 's', 'i' }, {},
			{ 'i', 'h' }, {} };
	private static int[] PROC_ORDER = { 0, 2, 4, 6, 8, 5 };

	static {
		for (int i = 0; i < symbols.length; i++) {
			symbols[i] -= 'a';
		}
		for (char[] num : redundants) {
			for (int i = 0; i < num.length; i++) {
				num[i] -= 'a';
			}
		}
	}

	public String originalDigits(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i : PROC_ORDER) {
			for (char c : redundants[i]) {
				if (count[c] > 0) {
					count[c] -= count[symbols[i]];
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < symbols.length; i++) {
			for (int j = 0; j < count[symbols[i]]; j++) {
				builder.append(i);
			}
		}
		return builder.toString();
	}
}
