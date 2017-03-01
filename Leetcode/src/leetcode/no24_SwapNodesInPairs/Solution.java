package leetcode.no24_SwapNodesInPairs;

import leetcode.ListNode;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode node = dummy;
		while (node.next != null && node.next.next != null) {
			ListNode first = node.next;
			node.next = first.next;
			first.next = node.next.next;
			node.next.next = first;
			node = first;
		}
		return dummy.next;
	}

	public ListNode swapPairs2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode node = head.next;
		head.next = swapPairs(head.next.next);
		node.next = head;
		return node;
	}
}
