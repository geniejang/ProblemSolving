package leetcode.no83_RemoveDuplicatesFromSortedList;

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

	@Test
	public void nullList() {
		ListNode actual = solution.deleteDuplicates(null);
		assertNull(actual);
	}

	private void assertNoDuplicate(ListNode head) {
		ListNode actual = solution.deleteDuplicates(head);
		assertNotNull(actual);
		while (actual.next != null) {
			assertNotEquals(actual.val, actual.next.val);
			actual = actual.next;
		}
	}

	@Test
	public void removeOne() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);

		assertNoDuplicate(head);
	}

	@Test
	public void removeTwoValues() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);

		assertNoDuplicate(head);
	}

	@Test
	public void tripleDuplicates() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(3);
		
		assertNoDuplicate(head);
	}

	@Test
	public void allTheSame() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next = new ListNode(1);
		
		assertNoDuplicate(head);
	}

}
