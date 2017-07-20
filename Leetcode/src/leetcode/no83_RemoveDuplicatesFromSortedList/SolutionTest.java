package leetcode.no83_RemoveDuplicatesFromSortedList;

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
	public void nullList() {
		ListNode actual = solution.deleteDuplicates(null);
		assertNull(actual);
	}

	private void assertNoDuplicate(ListNode head) {
		ListNode actual = solution.deleteDuplicates(head);
		assertNotNull(actual);
		while (actual.next != null) {
			assertNotEquals(actual.val, actual.next.val);
			actual = actual.next;
		}
	}

	@Test
	public void removeOne() {
		ListNode head = ListNode.from(new Integer[] { 1, 1, 2 });
		assertNoDuplicate(head);
	}

	@Test
	public void removeTwoValues() {
		ListNode head = ListNode.from(new Integer[] { 1, 1, 2, 3, 3 });
		assertNoDuplicate(head);
	}

	@Test
	public void tripleDuplicates() {
		ListNode head = ListNode.from(new Integer[] { 1, 1, 2, 3, 3, 3 });
		assertNoDuplicate(head);
	}

	@Test
	public void allTheSame() {
		ListNode head = ListNode.from(new Integer[] { 1, 1, 1, 1, 1, 1 });
		assertNoDuplicate(head);
	}

}
