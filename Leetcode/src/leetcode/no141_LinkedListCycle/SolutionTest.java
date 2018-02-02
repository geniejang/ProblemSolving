package leetcode.no141_LinkedListCycle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertCycle(boolean expected, ListNode head) {
		boolean actual = solution.hasCycle(head);
		assertEquals(expected, actual);
	}

	@Test
	public void emptyList() {
		ListNode head = null;
		boolean expected = false;
		assertCycle(expected, head);
	}

	@Test
	public void singleNodeNoCycle() {
		ListNode head = new ListNode(3);
		boolean expected = false;
		assertCycle(expected, head);
	}

	@Test
	public void headCycle() {
		ListNode head = new ListNode(3);
		head.next = head;
		boolean expected = true;
		assertCycle(expected, head);
	}

	@Test
	public void singleNodeCycle() {
		ListNode head = ListNode.from(new Integer[] { 3, 4 });
		head.next.next = head.next;
		boolean expected = true;
		assertCycle(expected, head);
	}

	@Test
	public void twoEntireNodeCycle() {
		ListNode head = ListNode.from(new Integer[] { 3, 4 });
		head.next.next = head;
		boolean expected = true;
		assertCycle(expected, head);
	}

}
