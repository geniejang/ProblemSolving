package leetcode.no682_BaseballGame;

import java.util.Stack;

public class Solution {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		for (String op : ops) {
			switch (op) {
			case "C":
				if (!stack.empty()) {
					stack.pop();
				}
				break;
			case "D":
				if (!stack.empty()) {
					stack.push(stack.peek() * 2);
				}
				break;
			case "+":
				if (stack.size() >= 2) {
					int last = stack.pop();
					int sum = last + stack.peek();
					stack.push(last);
					stack.push(sum);
				}
				break;
			default:
				stack.push(Integer.valueOf(op));
			}
		}
		int total = 0;
		while (!stack.empty()) {
			total += stack.pop();
		}
		return total;
	}
}
