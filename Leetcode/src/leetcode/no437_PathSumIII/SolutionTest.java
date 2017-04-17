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
		Integer[] tree = { 10, 5, -3, 3, 2, null, 11, 3, -2, null, 1 };
		TreeNode root = TreeNode.from(tree);

		assertEquals(3, solution.pathSum(root, 8));
	}

	@Test
	public void nonZeroSum() {
		TreeNode root = new TreeNode(1);

		assertEquals(0, solution.pathSum(root, 0));
	}

	@Test
	public void example2() {
		Integer[] tree = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		TreeNode root = TreeNode.from(tree);

		assertEquals(3, solution.pathSum(root, 22));
	}

	@Test
	public void nonZeroSum2() {
		Integer[] tree = { 1, 2 };
		TreeNode root = TreeNode.from(tree);

		assertEquals(0, solution.pathSum(root, 0));
	}

	@Test
	public void zeroSum() {
		Integer[] tree = { 1, -2, -3, 1, 3, -2, null, -1 };
		TreeNode root = TreeNode.from(tree);

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
		Integer[] tree = { 1, 2 };
		TreeNode root = TreeNode.from(tree);

		assertEquals(1, solution.pathSum(root, 2));
	}

}
