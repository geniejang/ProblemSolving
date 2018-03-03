package leetcode.no199_BinaryTreeRightSideView;

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

	private void assertRightSideView(List<Integer> expected, TreeNode root) {
		List<Integer> actual = solution.rightSideView(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		TreeNode root = TreeNode.from(1, 2, 3, null, 5, null, 4);
		List<Integer> expected = List.of(1, 3, 4);
		assertRightSideView(expected, root);
	}

	@Test
	public void emptyTree() {
		TreeNode root = null;
		List<Integer> expected = List.of();
		assertRightSideView(expected, root);
	}

	@Test
	public void singleRoot() {
		TreeNode root = TreeNode.from(1);
		List<Integer> expected = List.of(1);
		assertRightSideView(expected, root);
	}

	@Test
	public void someEmptyRights() {
		TreeNode root = TreeNode.from(1, 2, 3, 5, null, 4, null, 7);
		List<Integer> expected = List.of(1, 3, 4, 7);
		assertRightSideView(expected, root);
	}

}
