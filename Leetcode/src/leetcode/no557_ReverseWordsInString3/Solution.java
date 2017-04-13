package leetcode.no557_ReverseWordsInString3;

import java.util.Stack;

public class Solution {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				stack.push(c);
			} else {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(c);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
}
