package leetcode.no226_InvertBinaryTree;

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

	@Test
	public void example() {
		Integer[] tree = { 4, 2, 7, 1, 3, 6, 9 };
		Integer[] expTree = { 4, 7, 2, 9, 6, 3, 1 };
		TreeNode root = TreeNode.from(tree);
		TreeNode expected = TreeNode.from(expTree);
		TreeNode actual = solution.invertTree(root);
		assertEquals(expected, actual);
	}

}
