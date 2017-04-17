package leetcode.no513_FindBottomLeftTreeValue;

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

	private void assertLeftmost(int expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		int actual = solution.findBottomLeftValue(root);
		assertEquals(expected, actual);
	}

	@Test
	public void balanced() {
		Integer[] tree = { 2, 1, 3 };
		int expected = 1;
		assertLeftmost(expected, tree);
	}

	@Test
	public void nonBalanced() {
		Integer[] tree = { 1, 2, 3, 4, null, 5, 6, null, null, null, null, 7 };
		int expected = 7;
		assertLeftmost(expected, tree);
	}

}
