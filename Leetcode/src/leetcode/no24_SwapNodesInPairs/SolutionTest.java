package leetcode.no24_SwapNodesInPairs;

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
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		first.next = second;
		second.next = third;
		third.next = fourth;
		ListNode actual = solution.swapPairs(first);
		assertEquals(second, actual);
		assertEquals(first, actual.next);
		assertEquals(fourth, actual.next.next);
		assertEquals(third, actual.next.next.next);
	}
	
	@Test
	public void twoNodes() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		first.next = second;
		ListNode actual = solution.swapPairs(first);
		assertEquals(second, actual);
		assertEquals(first, actual.next);
	}

}
