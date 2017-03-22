package leetcode.no394_DecodeString;

import java.util.Stack;

public class Solution {
	public String decodeString(String s) {
		StringBuilder builder = new StringBuilder();
		Stack<Integer> stackNum = new Stack<>();
		Stack<String> stackStr = new Stack<>();

		int num = 0;
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				num = num * 10 + c - '0';
			} else if (c == '[') {
				stackStr.push(builder.toString());
				builder.setLength(0);
				stackNum.push(num);
				num = 0;
			} else if (c == ']') {
				String piece = builder.toString();
				builder.setLength(0);
				int repeat = stackNum.pop();
				builder.append(stackStr.pop());
				while (repeat-- > 0) {
					builder.append(piece);
				}
			} else {
				builder.append(c);
			}
		}
		return builder.toString();
	}
}
