package leetcode.no328_OddEvenLinkedList;

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

	private void assertListEquals(ListNode actuals, ListNode expecteds) {
		ListNode actual = actuals;
		ListNode expected = expecteds;
		assertEquals(expected == null, actual == null);
		while (actual != null && expected != null) {
			assertEquals(expected.val, actual.val);
			actual = actual.next;
			expected = expected.next;
		}
		assertEquals(expected == null, actual == null);
	}

	@Test
	public void fiveNodes() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode expecteds = new ListNode(1);
		expecteds.next = new ListNode(3);
		expecteds.next.next = new ListNode(5);
		expecteds.next.next.next = new ListNode(2);
		expecteds.next.next.next.next = new ListNode(4);

		ListNode actuals = solution.oddEvenList(head);
		assertListEquals(actuals, expecteds);
	}

	@Test
	public void eightNodes() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = new ListNode(8);

		ListNode expecteds = new ListNode(1);
		expecteds.next = new ListNode(3);
		expecteds.next.next = new ListNode(5);
		expecteds.next.next.next = new ListNode(7);
		expecteds.next.next.next.next = new ListNode(2);
		expecteds.next.next.next.next.next = new ListNode(4);
		expecteds.next.next.next.next.next.next = new ListNode(6);
		expecteds.next.next.next.next.next.next.next = new ListNode(8);

		ListNode actuals = solution.oddEvenList(head);
		assertListEquals(actuals, expecteds);
	}

}
