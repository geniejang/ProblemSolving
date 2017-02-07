package leetcode.no168_ExcelSheetColumnTitle;

public class Solution {
	public String convertToTitle(int n) {
		StringBuilder builder = new StringBuilder();
		while (n > 0) {
			n--;
			builder.append((char) ('A' + n % 26));
			n /= 26;
		}
		return builder.reverse().toString();
	}
}
