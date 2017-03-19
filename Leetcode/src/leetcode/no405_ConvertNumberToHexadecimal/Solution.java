package leetcode.no405_ConvertNumberToHexadecimal;

import java.util.Stack;

public class Solution {
	public String toHex(int num) {
		String n = "";
		int hexDigit = num & 0xf;
		if ((num & 0xfffffff0) != 0) {
			n = toHex(num >>> 4);
		}
		return n + (char) (hexDigit + (hexDigit < 10 ? '0' : 'a' - 10));
	}

	public String toHex2(int num) {
		Stack<Integer> stack = new Stack<>();
		do {
			stack.push(num & 0xf);
			num >>>= 4;
		} while (num != 0);
		StringBuilder builder = new StringBuilder();
		while (!stack.isEmpty()) {
			int digit = stack.pop();
			char hex = (char) (digit < 10 ? ('0' + digit) : ('a' + digit - 10));
			builder.append(hex);
		}
		return builder.toString();
	}
}
