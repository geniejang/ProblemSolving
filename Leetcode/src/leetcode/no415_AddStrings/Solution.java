package leetcode.no415_AddStrings;

public class Solution {
	public String addStrings(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		int longer = Integer.max(len1, len2);
		int shorter = Integer.min(len1, len2);
		StringBuilder builder = new StringBuilder(longer + 1);
		int carry = 0;
		for (int i = 1; i <= shorter; i++) {
			int digit1 = num1.charAt(len1 - i) - '0';
			int digit2 = num2.charAt(len2 - i) - '0';
			int sum = digit1 + digit2 + carry;
			builder.append(sum % 10);
			carry = sum / 10;
		}
		if (len1 != len2) {
			String left = len1 < len2 ? num2 : num1;
			for (int i = shorter + 1; i <= longer; i++) {
				int sum = left.charAt(longer - i) - '0' + carry;
				builder.append(sum % 10);
				carry = sum / 10;
			}
		}
		if (carry > 0) {
			builder.append(carry);
		}
		return builder.reverse().toString();
	}
}
