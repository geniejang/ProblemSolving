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

	private void assertList(ListNode expected, ListNode head) {
		ListNode actual = solution.oddEvenList(head);
		assertEquals(expected, actual);
	}

	@Test
	public void fiveNodes() {
		ListNode head = ListNode.from(1, 2, 3, 4, 5);
		ListNode expected = ListNode.from(1, 3, 5, 2, 4);
		assertList(expected, head);
	}

	@Test
	public void eightNodes() {
		ListNode head = ListNode.from(1, 2, 3, 4, 5, 6, 7, 8);
		ListNode expected = ListNode.from(1, 3, 5, 7, 2, 4, 6, 8);
		assertList(expected, head);
	}

}
