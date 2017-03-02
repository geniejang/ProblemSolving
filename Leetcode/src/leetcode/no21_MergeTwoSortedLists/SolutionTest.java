package leetcode.no21_MergeTwoSortedLists;

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

	private void assert1ToN(int nNode, ListNode l1, ListNode l2) {
		ListNode actuals = solution.mergeTwoLists(l1, l2);
		for (int i = 0; i < nNode; i++) {
			assertEquals(i + 1, actuals.val);
			actuals = actuals.next;
		}
		assertNull(actuals);
	}

	@Test
	public void oneByOne() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		assert1ToN(4, l1, l2);
	}

	@Test
	public void oneByOne2() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		assert1ToN(4, l2, l1);
	}

	@Test
	public void empty() {
		assert1ToN(0, null, null);
	}

	@Test
	public void follow() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		assert1ToN(4, l1, l2);
	}

	@Test
	public void follow2() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		assert1ToN(4, l2, l1);
	}
}
