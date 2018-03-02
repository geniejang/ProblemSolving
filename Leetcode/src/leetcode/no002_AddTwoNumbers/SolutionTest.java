package leetcode.no002_AddTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;

public class SolutionTest {

	Solution solution;

	@Before
	public void instantiate() {
		solution = new Solution();
	}

	private void assertResult(ListNode expected, ListNode l1, ListNode l2) {
		ListNode actual = solution.addTwoNumbers(l1, l2);
		assertEquals(expected, actual);
	}

	@Test
	public void addSingleDigits() {
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
		ListNode expected = new ListNode(7);
		assertResult(expected, l1, l2);
	}

	@Test
	public void addSingleDigitsWithCarry() {
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(5);
		ListNode expected = ListNode.from(2, 1);
		assertResult(expected, l1, l2);
	}

	@Test
	public void addTripleDigits() {
		ListNode l1 = ListNode.from(2, 4, 3);
		ListNode l2 = ListNode.from(5, 6, 4);
		ListNode expected = ListNode.from(7, 0, 8);
		assertResult(expected, l1, l2);
	}

	@Test
	public void addTripleDigitsWithCarry() {
		ListNode l1 = ListNode.from(7, 4, 6);
		ListNode l2 = ListNode.from(1, 7, 5);
		ListNode expected = ListNode.from(8, 1, 2, 1);
		assertResult(expected, l1, l2);
	}
}
