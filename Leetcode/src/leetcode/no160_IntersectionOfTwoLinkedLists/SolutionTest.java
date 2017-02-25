package leetcode.no160_IntersectionOfTwoLinkedLists;

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

	private void assertIntersection(ListNode expected, ListNode headA, ListNode headB) {
		ListNode actual = solution.getIntersectionNode(headA, headB);
		assertEquals(expected, actual);
	}

	@Test
	public void normalCase() {
		ListNode a1 = new ListNode(0);
		ListNode a2 = new ListNode(0);
		ListNode b1 = new ListNode(0);
		ListNode b2 = new ListNode(0);
		ListNode b3 = new ListNode(0);
		ListNode c1 = new ListNode(0);
		ListNode c2 = new ListNode(0);
		ListNode c3 = new ListNode(0);
		a1.next = a2;
		a2.next = c1;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		c1.next = c2;
		c2.next = c3;

		assertIntersection(c1, a1, b1);
	}

	@Test
	public void noIntersection() {
		ListNode a1 = new ListNode(0);
		a1.next = new ListNode(0);
		a1.next.next = new ListNode(0);
		ListNode b1 = new ListNode(0);
		b1.next = new ListNode(0);
		b1.next.next = new ListNode(0);

		assertIntersection(null, a1, b1);
	}

	@Test
	public void emptyLists() {
		assertIntersection(null, null, null);
	}

	@Test
	public void onEmpty() {
		ListNode a1 = new ListNode(0);
		a1.next = new ListNode(0);
		a1.next.next = new ListNode(0);
		assertIntersection(null, a1, null);
	}

}
