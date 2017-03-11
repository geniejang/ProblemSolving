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

	private void assertLeftmost(int expected, TreeNode root) {
		int actual = solution.findBottomLeftValue(root);
		assertEquals(expected, actual);
	}

	@Test
	public void balanced() {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		int expected = 1;
		assertLeftmost(expected, root);
	}

	@Test
	public void nonBalanced() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.left.left = new TreeNode(7);
		root.right.right = new TreeNode(6);
		int expected = 7;
		assertLeftmost(expected, root);
	}

}
