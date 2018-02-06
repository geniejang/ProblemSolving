package leetcode.no109_ConvertSortedListToBinarySearchTree;

import leetcode.ListNode;
import leetcode.TreeNode;

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		return sortedListToBST(head, null);
	}

	private TreeNode sortedListToBST(ListNode head, ListNode tail) {
		if (head == tail) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = sortedListToBST(head, slow);
		root.right = sortedListToBST(slow.next, tail);
		return root;
	}
}
