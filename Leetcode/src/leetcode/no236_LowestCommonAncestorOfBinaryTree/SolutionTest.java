package leetcode.no236_LowestCommonAncestorOfBinaryTree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	private Solution solution;

	private TreeNode root;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();

		root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right = new TreeNode(1);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
	}

	@Test
	public void root() {
		for (int i = 0; i < 1000000; i++) {

			TreeNode p = root.left;
			TreeNode q = root.right;
			TreeNode expected = root;

			TreeNode actual = solution.lowestCommonAncestor(root, p, q);
			assertEquals(expected, actual);
		}
	}

	@Test
	public void leftOfRoot() {
		TreeNode p = root.left;
		TreeNode q = root.left.right.right;
		TreeNode expected = root.left;

		TreeNode actual = solution.lowestCommonAncestor(root, p, q);
		assertEquals(expected, actual);
	}

	@Test
	public void invalid() {
		TreeNode p = root.left;
		TreeNode q = new TreeNode(-1);
		TreeNode expected = null;

		TreeNode actual = solution.lowestCommonAncestor(root, p, q);
		assertEquals(expected, actual);
	}

}
