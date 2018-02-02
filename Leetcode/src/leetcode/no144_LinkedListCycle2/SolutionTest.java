package leetcode.no144_LinkedListCycle2;

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

	private void assertCycle(ListNode expected, ListNode head) {
		ListNode actual = solution.detectCycle(head);
		assertEquals(expected, actual);
	}

	@Test
	public void emptyList() {
		ListNode head = null;
		ListNode expected = null;
		assertCycle(expected, head);
	}

	@Test
	public void singleNodeNoCycle() {
		ListNode head = new ListNode(0);
		ListNode expected = null;
		assertCycle(expected, head);
	}

	// TODO: Implement test cases of cycle

}
