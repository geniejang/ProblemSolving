package leetcode.no437_PathSumIII;

import static org.junit.Assert.assertEquals;

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
	public void example() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(1);
		root.right = new TreeNode(-3);
		root.right.right = new TreeNode(11);

		assertEquals(3, solution.pathSum(root, 8));
	}

	@Test
	public void nonZeroSum() {
		TreeNode root = new TreeNode(1);

		assertEquals(0, solution.pathSum(root, 0));
	}

	@Test
	public void example2() {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left.left = new TreeNode(5);
		root.right.left.right = new TreeNode(1);

		assertEquals(3, solution.pathSum(root, 22));
	}

	@Test
	public void nonZeroSum2() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);

		assertEquals(0, solution.pathSum(root, 0));
	}

	@Test
	public void zeroSum() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(-2);
		root.left.left.left = new TreeNode(-1);

		int actual = solution.pathSum(root, 0);
		assertEquals(2, actual);
	}

	@Test
	public void single2() {
		TreeNode root = new TreeNode(1);

		assertEquals(1, solution.pathSum(root, 1));
	}

	@Test
	public void example3() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);

		assertEquals(1, solution.pathSum(root, 2));
	}

}
