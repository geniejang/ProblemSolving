package leetcode.no023_MergeKSortedLists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

	private void assertMerged(ListNode expected, ListNode[] lists) {
		ListNode actual = solution.mergeKLists(lists);
		assertEquals(expected, actual);
	}

	@Test
	public void nullLists() {
		ListNode[] lists = null;
		ListNode expected = null;
		assertMerged(expected, lists);
	}
	
	@Test
	public void empty() {
		ListNode[] lists = {};
		ListNode expected = null;
		assertMerged(expected, lists);
	}

	@Test
	public void nullList() {
		ListNode[] lists = { null };
		ListNode expected = null;
		assertMerged(expected, lists);
	}

	@Test
	public void twoLists() {
		ListNode[] lists = { ListNode.from(1, 5), ListNode.from(2, 3) };
		ListNode expected = ListNode.from(1, 2, 3, 5);
		assertMerged(expected, lists);
	}

}
