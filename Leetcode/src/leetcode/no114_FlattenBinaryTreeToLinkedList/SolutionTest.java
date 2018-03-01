package leetcode.no114_FlattenBinaryTreeToLinkedList;

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

	private void assertFlattened(TreeNode expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		solution.flatten2(root);
		assertEquals(expected, root);
	}

	@Test
	public void emptyTree() {
		Integer[] tree = {};
		TreeNode expected = null;
		assertFlattened(expected, tree);
	}

	@Test
	public void singleNode() {
		Integer[] tree = { 6 };
		TreeNode expected = new TreeNode(6);
		assertFlattened(expected, tree);
	}

	@Test
	public void leftOnly() {
		Integer[] tree = { 2, 5 };
		TreeNode expected = new TreeNode(2);
		expected.right = new TreeNode(5);
		assertFlattened(expected, tree);
	}

	@Test
	public void rightOnly() {
		Integer[] tree = { 2, null, 7 };
		TreeNode expected = new TreeNode(2);
		expected.right = new TreeNode(7);
		assertFlattened(expected, tree);
	}

	@Test
	public void both() {
		Integer[] tree = { 2, 5, 7 };
		TreeNode expected = new TreeNode(2);
		expected.right = new TreeNode(5);
		expected.right.right = new TreeNode(7);
		assertFlattened(expected, tree);
	}

	@Test
	public void example() {
		Integer[] tree = { 1, 2, 5, 3, 4, null, 6 };
		TreeNode expected = new TreeNode(1);
		expected.right = new TreeNode(2);
		expected.right.right = new TreeNode(3);
		expected.right.right.right = new TreeNode(4);
		expected.right.right.right.right = new TreeNode(5);
		expected.right.right.right.right.right = new TreeNode(6);
		assertFlattened(expected, tree);
	}

}
