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
		ListNode a1 = ListNode.from(new Integer[] { 0, 0 });
		ListNode a2 = a1.next;
		ListNode b1 = ListNode.from(new Integer[] { 0, 0, 0 });
		ListNode b3 = b1.next.next;
		ListNode c1 = ListNode.from(new Integer[] { 0, 0, 0 });
		a2.next = c1;
		b3.next = c1;

		assertIntersection(c1, a1, b1);
	}

	@Test
	public void noIntersection() {
		ListNode a1 = ListNode.from(new Integer[] { 0, 0, 0 });
		ListNode b1 = ListNode.from(new Integer[] { 0, 0, 0 });

		assertIntersection(null, a1, b1);
	}

	@Test
	public void emptyLists() {
		assertIntersection(null, null, null);
	}

	@Test
	public void onEmpty() {
		ListNode a1 = ListNode.from(new Integer[] { 0, 0, 0 });
		assertIntersection(null, a1, null);
	}

}
