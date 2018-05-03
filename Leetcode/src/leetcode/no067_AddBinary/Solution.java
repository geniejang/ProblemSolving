package leetcode.no067_AddBinary;

public class Solution {
	public String addBinary(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		int len = Integer.max(alen, blen) + 1;
		int carry = 0;
		char[] str = new char[len];
		for (int i = 1; i <= len; i++) {
			int d = carry;
			d += i <= alen ? a.charAt(alen - i) - '0' : 0;
			d += i <= blen ? b.charAt(blen - i) - '0' : 0;
			carry = d >> 1;
			str[len - i] = ((d & 1) == 1) ? '1' : '0';
		}
		int zeroes = 0;
		while (zeroes + 1 < len && str[zeroes] == '0') {
			zeroes++;
		}
		return String.copyValueOf(str, zeroes, len - zeroes);
	}
}
