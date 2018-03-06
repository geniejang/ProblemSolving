package leetcode.no783_MinimumDistanceBetweenBstNodes;

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

	private void assertDifference(int expected, TreeNode root) {
		int actual = solution.minDiffInBST(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		TreeNode root = TreeNode.from(4, 2, 6, 1, 3);
		int expected = 1;
		assertDifference(expected, root);
	}

}
