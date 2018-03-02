package leetcode.no024_SwapNodesInPairs;

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
	public void fourNodes() {
		ListNode first = ListNode.from(1, 2, 3, 4);
		ListNode second = first.next;
		ListNode third = first.next.next;
		ListNode fourth = first.next.next.next;
		ListNode actual = solution.swapPairs(first);
		assertEquals(second, actual);
		assertEquals(first, actual.next);
		assertEquals(fourth, actual.next.next);
		assertEquals(third, actual.next.next.next);
	}

	@Test
	public void twoNodes() {
		ListNode first = ListNode.from(1, 2);
		ListNode second = first.next;
		ListNode actual = solution.swapPairs(first);
		assertEquals(second, actual);
		assertEquals(first, actual.next);
	}

}
