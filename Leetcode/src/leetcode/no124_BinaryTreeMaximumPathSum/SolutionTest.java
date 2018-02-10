package leetcode.no124_BinaryTreeMaximumPathSum;

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

	private void assertPathSum(int expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		int actual = solution.maxPathSum(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		Integer[] tree = { 1, 2, 3 };
		int expected = 6;
		assertPathSum(expected, tree);
	}

	@Test
	public void singleNodePositiveValue() {
		Integer[] tree = { 11 };
		int expected = 11;
		assertPathSum(expected, tree);
	}

	@Test
	public void singleNodeNegativeValue() {
		Integer[] tree = { -11 };
		int expected = -11;
		assertPathSum(expected, tree);
	}

	@Test
	public void nullTree() {
		Integer[] tree = {};
		int expected = Integer.MIN_VALUE;
		assertPathSum(expected, tree);
	}

}
