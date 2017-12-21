package leetcode.no019_RemoveNthNodeFromEndOfList;

import leetcode.ListNode;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode observer = head;
		ListNode follower = new ListNode(0);
		follower.next = head;
		for (int i = 0; i < n; i++)
			observer = observer.next;
		while (observer != null) {
			observer = observer.next;
			follower = follower.next;
		}
		if (follower.next == head)
			return head.next;
		follower.next = follower.next.next;

		return head;
	}
}
