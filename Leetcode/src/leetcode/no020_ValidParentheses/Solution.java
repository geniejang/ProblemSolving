package leetcode.no020_ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	private char getCounter(char c) {
		switch (c) {
		case ')':
			return '(';
		case '}':
			return '{';
		case ']':
			return '[';
		default:
			return ' '; // Never to be pushed into the stack
		}
	}

	public boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>(s.length());
		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;
			default:
				if (stack.isEmpty() || stack.peek() != getCounter(c)) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
}
