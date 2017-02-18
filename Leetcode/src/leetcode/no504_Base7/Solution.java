package leetcode.no504_Base7;

public class Solution {
	public String convertToBase7(int num) {
		boolean isMinus = num < 0;
		if (isMinus)
			num = -num;
		int converted = 0;
		int base = 1;
		while (num > 0) {
			converted += base * (num % 7);
			num /= 7;
			base *= 10;
		}
		if (isMinus)
			converted = -converted;

		return String.valueOf(converted);
	}
}
