package leetcode.no662_MaximumWidthOfBinaryTree;

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

	private void assertWidth(int expected, Integer[] tree) {
		int actual = solution.widthOfBinaryTree(TreeNode.from(tree));
		assertEquals(expected, actual);
	}

	@Test
	public void nullRoot() {
		Integer[] tree = { null };
		int expected = 0;
		assertWidth(expected, tree);
	}

	@Test
	public void example1() {
		Integer[] tree = { 1, 3, 2, 5, 3, null, 9 };
		int expected = 4;
		assertWidth(expected, tree);
	}

	@Test
	public void example2() {
		Integer[] tree = { 1, 3, null, 5, 3 };
		int expected = 2;
		assertWidth(expected, tree);
	}

	@Test
	public void example3() {
		Integer[] tree = { 1, 3, 2, 5 };
		int expected = 2;
		assertWidth(expected, tree);
	}

	@Test
	public void example4() {
		Integer[] tree = { 1, 3, 2, 5, null, null, 9, 6, null, null, null, null, null, null, 7 };
		int expected = 8;
		assertWidth(expected, tree);
	}

}
