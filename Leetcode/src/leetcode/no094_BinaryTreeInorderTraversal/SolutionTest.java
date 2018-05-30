package leetcode.no094_BinaryTreeInorderTraversal;

import static org.junit.Assert.*;

import java.util.List;

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

	private void assertInorder(List<Integer> expected, TreeNode tree) {
		List<Integer> actual = solution.inorderTraversal(tree);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		TreeNode tree = TreeNode.from(1, null, 2, null, null, 3);
		List<Integer> expected = List.of(1, 3, 2);
		assertInorder(expected, tree);
	}

	@Test
	public void nullTree() {
		TreeNode tree = TreeNode.from();
		List<Integer> expected = List.of();
		assertInorder(expected, tree);
	}
	
	@Test
	public void singleNode() {
		TreeNode tree = TreeNode.from(1);
		List<Integer> expected = List.of(1);
		assertInorder(expected, tree);
	}

}
