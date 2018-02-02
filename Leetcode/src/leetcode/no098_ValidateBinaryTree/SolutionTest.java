package leetcode.no098_ValidateBinaryTree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	Solution solution;

	@Before
	public void init() {
		solution = new Solution();
	}

	private void assertValid(boolean expected, TreeNode root) {
		boolean actual = solution.isValidBST(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		TreeNode root = TreeNode.from(new Integer[] { 2, 1, 3 });
		boolean expected = true;
		assertValid(expected, root);
	}

	@Test
	public void example2() {
		TreeNode root = TreeNode.from(new Integer[] { 1, 2, 3 });
		boolean expected = false;
		assertValid(expected, root);
	}

	@Test
	public void emptyTree() {
		TreeNode root = null;
		boolean expected = true;
		assertValid(expected, root);
	}

	@Test
	public void duplicateNodes() {
		TreeNode root = TreeNode.from(new Integer[] { 1, 1 });
		boolean expected = false;
		assertValid(expected, root);
	}

	@Test
	public void lessInRightSubtree() {
		TreeNode root = TreeNode.from(new Integer[] { 10, 5, 15, null, null, 6, 20 });
		boolean expected = false;
		assertValid(expected, root);
	}

	@Test
	public void intMin() {
		TreeNode root = TreeNode.from(new Integer[] { Integer.MIN_VALUE });
		boolean expected = true;
		assertValid(expected, root);
	}

}
