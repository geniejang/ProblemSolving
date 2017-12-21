package leetcode.no019_RemoveNthNodeFromEndOfList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertRemoved(ListNode head, int n, ListNode toBeRemoved) {
		ListNode actual = solution.removeNthFromEnd(head, n);
		assertNotNull(actual);
		while (actual != null) {
			assertNotEquals(toBeRemoved, actual);
			actual = actual.next;
		}
	}

	@Test
	public void removeSecondFromEnd() {
		ListNode head = ListNode.from(new Integer[] { 1, 2, 3, 4, 5 });
		int n = 2;
		ListNode toBeRemoved = head.next.next.next;

		assertRemoved(head, n, toBeRemoved);
	}

	@Test
	public void removeLast() {
		ListNode head = ListNode.from(new Integer[] { 1, 2 });
		int n = 1;
		ListNode toBeRemoved = head.next;

		assertRemoved(head, n, toBeRemoved);
	}

	@Test
	public void mustNull() {
		ListNode head = new ListNode(1);
		int n = 1;

		ListNode actual = solution.removeNthFromEnd(head, n);
		assertNull(actual);
	}

	@Test
	public void removeFirst() {
		ListNode head = ListNode.from(new Integer[] { 1, 2 });
		int n = 2;
		ListNode toBeRemoved = head;

		assertRemoved(head, n, toBeRemoved);
	}
}
