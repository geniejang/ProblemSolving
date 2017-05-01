package leetcode.no563_BinaryTreeTilt;

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

	@Test
	public void nullNode() {
		int expected = 0;
		int actual = solution.findTilt(null);
		assertEquals(expected, actual);
	}

	@Test
	public void tree() {
		Integer[] arr = { 1, 2, 3 };
		TreeNode root = TreeNode.from(arr);
		assertEquals(0, solution.findTilt(root.left));
		assertEquals(0, solution.findTilt(root.right));
		assertEquals(1, solution.findTilt(root));
	}

}
