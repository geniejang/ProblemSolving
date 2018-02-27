package leetcode.no103_BinaryTreeZigzagLevelOrderTraversal;

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

	private void assertZigzag(List<List<Integer>> expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		List<List<Integer>> actual = solution.zigzagLevelOrder(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
		List<List<Integer>> expected = List.of(List.of(3), List.of(20, 9), List.of(15, 7));
		assertZigzag(expected, tree);
	}

	@Test
	public void nullRoot() {
		Integer[] tree = null;
		List<List<Integer>> expected = List.of();
		assertZigzag(expected, tree);
	}

}
