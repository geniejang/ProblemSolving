package leetcode.no109_ConvertSortedListToBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;
import leetcode.TreeNode;

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

	@Test
	public void example() {
		ListNode head = ListNode.from(new Integer[] { -10, -3, 0, 5, 9 });
		TreeNode expected = TreeNode.from(new Integer[] { 0, -3, 9, -10, null, 5 });
		TreeNode actual = solution.sortedListToBST(head);
		assertEquals(expected, actual);
	}

}
