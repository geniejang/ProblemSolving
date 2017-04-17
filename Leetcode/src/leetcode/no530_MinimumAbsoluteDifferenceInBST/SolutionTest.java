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
		Integer[] tree = { 1, null, 3, null, null, 2 };
		TreeNode root = TreeNode.from(tree);
		int expected = 1;
		assertDifference(expected, root);
	}

	@Test
	public void includeSameValues() {
		Integer[] tree = { 1, 1, 3 };
		TreeNode root = TreeNode.from(tree);
		int expected = 0;
		assertDifference(expected, root);
	}

}
