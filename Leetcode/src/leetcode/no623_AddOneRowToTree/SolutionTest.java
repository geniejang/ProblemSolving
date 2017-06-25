package leetcode.no623_AddOneRowToTree;

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

	private void assertTree(Integer[] input, int v, int d, Integer[] output) {
		TreeNode tree = TreeNode.from(input);
		TreeNode expected = TreeNode.from(output);
		TreeNode actual = solution.addOneRow(tree, v, d);
		assertEquals(expected, actual);
	}

	@Test
	public void aboveRoot() {
		Integer[] input = { 4, 2, 6 };
		int v = -1;
		int d = 1;
		Integer[] output = { -1, 4, null, 2, 6 };
		assertTree(input, v, d, output);
	}

	@Test
	public void both() {
		Integer[] input = { 4, 2, 6, 3, 1, 5 };
		int v = 1;
		int d = 2;
		Integer[] output = { 4, 1, 1, 2, null, null, 6, 3, 1, null, null, null, null, 5 };
		assertTree(input, v, d, output);
	}

	@Test
	public void left() {
		Integer[] input = { 4, 2, null, 3, 1 };
		int v = 1;
		int d = 3;
		Integer[] output = { 4, 2, null, 1, 1, null, null, 3, null, null, 1 };
		assertTree(input, v, d, output);
	}

}
