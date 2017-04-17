package leetcode.no101_SymmetricTree;

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
	public void trueOnNull() {
		assertTrue(solution.isSymmetric(null));
	}

	@Test
	public void symmetric() {
		TreeNode root = TreeNode.from(new Integer[] { 1, 2, 2, 3, 4, 4, 3 });
		boolean expected = true;
		boolean actual = solution.isSymmetric(root);
		assertEquals(expected, actual);
	}

	@Test
	public void asymmetric() {
		TreeNode root = TreeNode.from(new Integer[] { 1, 2, 2, null, 3, null, 3 });
		boolean expected = false;
		boolean actual = solution.isSymmetric(root);
		assertEquals(expected, actual);
	}

}
