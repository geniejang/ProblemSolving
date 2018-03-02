package leetcode.no445_AddTwoNumbers2;

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

	private void assertAdding(ListNode expected, ListNode l1, ListNode l2) {
		ListNode actual = solution.addTwoNumbers(l1, l2);
		assertEquals(expected, actual);
	}

	@Test
	public void addWithCarry() {
		ListNode l1 = ListNode.from(7, 2, 4, 3);
		ListNode l2 = ListNode.from(5, 6, 4);
		ListNode expected = ListNode.from(7, 8, 0, 7);
		assertAdding(expected, l1, l2);
	}

	@Test
	public void addZeroes() {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode expected = new ListNode(0);
		assertAdding(expected, l1, l2);
	}

}
