package leetcode.no002_AddTwoNumbers;

import leetcode.ListNode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode node = head;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum / 10;
			sum %= 10;
			node.next = new ListNode(sum);
			node = node.next;
		}

		return head.next;
	}
}
