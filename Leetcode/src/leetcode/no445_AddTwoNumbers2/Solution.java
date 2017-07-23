package leetcode.no445_AddTwoNumbers2;

import java.util.Stack;

import leetcode.ListNode;

public class Solution {
	private Stack<Integer> stackList(ListNode list) {
		Stack<Integer> stack = new Stack<>();
		for (ListNode node = list; node != null; node = node.next) {
			stack.push(node.val);
		}
		return stack;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> num1 = stackList(l1);
		Stack<Integer> num2 = stackList(l2);
		ListNode node = null;
		int carry = 0;
		while (!num1.isEmpty() || !num2.empty() || carry > 0) {
			int sum = carry + (num1.empty() ? 0 : num1.pop()) + (num2.empty() ? 0 : num2.pop());
			carry = sum / 10;
			ListNode newNode = new ListNode(sum % 10);
			newNode.next = node;
			node = newNode;
		}
		return node;
	}
}
