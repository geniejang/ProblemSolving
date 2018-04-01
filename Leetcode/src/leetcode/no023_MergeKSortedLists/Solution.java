package leetcode.no023_MergeKSortedLists;

import java.util.PriorityQueue;
import java.util.Queue;

import leetcode.ListNode;

public class Solution {
	/**
	 * Merge the given lists in the array.
	 * 1. Count each lists first.
	 * 2. Merge the two shortest lists by becoming a single list.
	 *  
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		ListNode[] len = new ListNode[lists.length];
		for (int i = 0; i < lists.length; i++) {
			len[i] = new ListNode(0);
			len[i].next = lists[i];
			for (ListNode node = lists[i]; node != null; node = node.next) {
				len[i].val++;
			}
		}
		Queue<ListNode> heap = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
		for (ListNode list : len) {
			heap.offer(list);
		}
		while (heap.size() > 1) {
			ListNode l1 = heap.poll();
			ListNode l2 = heap.poll();
			l1.next = mergeLists(l1.next, l2.next);
			l1.val += l2.val;
			heap.offer(l1);
		}
		return heap.poll().next;
	}

	/**
	 * Merge two given lists in the recursive manner.
	 * 
	 * @param l1
	 * @param l2
	 * @return head of the merged list
	 */
	private ListNode mergeLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeLists(l1, l2.next);
			return l2;
		}
	}
}
