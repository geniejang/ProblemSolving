package leetcode.no230_KthSmallestElementInBST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

	private void assertKth(int expected, Integer[] tree, int k) {
		TreeNode root = TreeNode.from(tree);
		int actual = solution.kthSmallest(root, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		Integer[] tree = { 8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15 };
		int k = 7;
		int expected = 7;
		assertKth(expected, tree, k);
	}

	@Test
	public void singleNode() {
		Integer[] tree = { 7 };
		int k = 1;
		int expected = 7;
		assertKth(expected, tree, k);
	}

}
