package leetcode.no2_AddTwoNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;

public class SolutionTest {

	Solution solution;

	@Before
	public void instantiate() {
		solution = new Solution();
	}

	private void assertResult(int[] expecteds, ListNode l1, ListNode l2) {
		ListNode actuals = solution.addTwoNumbers(l1, l2);

		for (int expected : expecteds) {
			if (actuals == null)
				fail("addTwoNumbers() returns incorrect answer.");
			assertEquals(expected, actuals.val);
			actuals = actuals.next;
		}
	}

	@Test
	public void addSingleDigits() {
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
		int[] expecteds = { 7 };
		assertResult(expecteds, l1, l2);
	}

	@Test
	public void addSingleDigitsWithCarry() {
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(5);
		int[] expecteds = { 2, 1 };
		assertResult(expecteds, l1, l2);
	}

	@Test
	public void addTripleDigits() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		int[] expecteds = { 7, 0, 8 };
		assertResult(expecteds, l1, l2);
	}

	@Test
	public void addTripleDigitsWithCarry() {
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(6);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(7);
		l2.next.next = new ListNode(5);
		int[] expecteds = { 8, 1, 2, 1 };
		assertResult(expecteds, l1, l2);
	}
}
