package leetcode.no654_MaximumBinaryTree;

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

	private void assertTree(TreeNode expected, int[] nums) {
		TreeNode actual = solution.constructMaximumBinaryTree(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 3, 2, 1, 6, 0, 5 };
		TreeNode expected = TreeNode.from(6, 3, 5, null, 2, 0, null, null, null, null, 1);
		assertTree(expected, nums);
	}

	@Test
	public void emptyTree() {
		int[] nums = {};
		TreeNode expected = TreeNode.from();
		assertTree(expected, nums);
	}

	@Test
	public void singleRoot() {
		int[] nums = { 1 };
		TreeNode expected = TreeNode.from(1);
		assertTree(expected, nums);
	}

	@Test
	public void skewedLeft() {
		int[] nums = { 6, 7, 8, 9 };
		TreeNode expected = TreeNode.from(9, 8, null, 7, null, null, null, 6);
		assertTree(expected, nums);
	}

	@Test
	public void skewedRight() {
		int[] nums = { 5, 4, 3, 2 };
		TreeNode expected = TreeNode.from(5, null, 4, null, null, null, 3, null, null, null, null, null, null, null, 2);
		assertTree(expected, nums);
	}

	@Test
	public void fullBinaryTreeOf3Depth() {
		int[] nums = { 1, 3, 2, 7, 4, 6, 5 };
		TreeNode expected = TreeNode.from(7, 3, 6, 1, 2, 4, 5);
		assertTree(expected, nums);
	}

}
