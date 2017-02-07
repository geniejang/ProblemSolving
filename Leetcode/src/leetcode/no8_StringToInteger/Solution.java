package leetcode.no8_StringToInteger;

public class Solution {
	private static final int MIN_LAST_DIGIT = Integer.MIN_VALUE % 10 * -1;
	private static final int MAX_LAST_DIGIT = Integer.MAX_VALUE % 10;
	private static final int THRESHOLD = Integer.MAX_VALUE / 10;

	public int myAtoi(String str) {
		if (str == null || str.length() == 0)
			return 0;

		int index = 0;
		for (; index < str.length(); index++)
			if (str.charAt(index) != ' ')
				break;

		int num = 0;
		if (index < str.length()) {
			char ch = str.charAt(index);
			boolean isMinus = ch == '-';
			if (isMinus || ch == '+')
				index++;

			while (index < str.length()) {
				ch = str.charAt(index++);
				if (ch < '0' || ch > '9')
					break;
				int digit = ch - '0';
				if (isMinus) {
					if (num > THRESHOLD || (num == THRESHOLD && digit > MIN_LAST_DIGIT))
						return Integer.MIN_VALUE;
				} else {
					if (num > THRESHOLD || (num == THRESHOLD && digit > MAX_LAST_DIGIT))
						return Integer.MAX_VALUE;
				}
				num = num * 10 + digit;
			}

			if (isMinus)
				num *= -1;
		}

		return num;
	}
}
