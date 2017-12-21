package leetcode.no725_SplitLinkedListInParts;

import leetcode.ListNode;

public class Solution {
	public ListNode[] splitListToParts(ListNode root, int k) {
		int count = 0;
		for (ListNode node = root; node != null; node = node.next) {
			count++;
		}
		int q = count / k;
		int r = count % k;
		ListNode[] parts = new ListNode[k];
		int i = 0;
		ListNode node = new ListNode(0);
		node.next = root;
		while (node.next != null) {
			parts[i] = node.next;
			node.next = null;
			node = new ListNode(0);
			node.next = parts[i];
			for (int j = q + (i < r ? 1 : 0); j > 0; j--) {
				node = node.next;
			}
			i++;
		}
		return parts;
	}
}
