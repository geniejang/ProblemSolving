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

		Integer[] tree = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
		root = TreeNode.from(tree);
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
