package leetcode.no101_SymmetricTree;

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

	@Test
	public void trueOnNull() {
		assertTrue(solution.isSymmetric(null));
	}

	@Test
	public void symmetric() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);

		boolean expected = true;
		boolean actual = solution.isSymmetric(root);
		assertEquals(expected, actual);
	}

	@Test
	public void asymmetric() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(3);

		boolean expected = false;
		boolean actual = solution.isSymmetric(root);
		assertEquals(expected, actual);
	}

}
