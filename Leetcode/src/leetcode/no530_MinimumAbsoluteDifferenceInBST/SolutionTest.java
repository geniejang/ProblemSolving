package leetcode.no530_MinimumAbsoluteDifferenceInBST;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

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

	private void assertDifference(int expected, TreeNode root) {
		int actual = solution.getMinimumDifference(root);
		assertEquals(expected, actual);
	}

	@Test
	public void sameDifferences() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		int expected = 1;
		assertDifference(expected, root);
	}

	@Test
	public void includeSameValues() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		int expected = 0;
		assertDifference(expected, root);
	}

}
