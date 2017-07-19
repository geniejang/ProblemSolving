package leetcode;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static ListNode from(Integer[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		ListNode head = new ListNode(arr[0]);
		ListNode node = head;
		for (int i = 1; i < arr.length; i++) {
			node.next = new ListNode(arr[i]);
			node = node.next;
		}
		return head;
	}

	@Override
	public boolean equals(Object obj) {
		if (false == obj instanceof ListNode) {
			return false;
		}
		ListNode node = (ListNode) obj;
		if (val != node.val)
			return false;

		return (next == null && node.next == null) || next.equals(node.next);
	}

	@Override
	public String toString() {
		return val + " -> " + next;
	}
}
