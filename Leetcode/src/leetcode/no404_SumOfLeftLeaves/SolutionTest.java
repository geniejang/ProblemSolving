package leetcode.no404_SumOfLeftLeaves;

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
	public void test() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		int expected = 24;
		int actual = solution.sumOfLeftLeaves(root);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		int expected = 4;
		int actual = solution.sumOfLeftLeaves(root);
		assertEquals(expected, actual);
	}

}
