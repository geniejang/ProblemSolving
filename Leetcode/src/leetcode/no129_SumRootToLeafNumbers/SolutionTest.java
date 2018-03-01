package leetcode.no129_SumRootToLeafNumbers;

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

	private void assertSum(int expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		int actual = solution.sumNumbersIter(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		Integer[] tree = { 1, 2, 3 };
		int expected = 25;
		assertSum(expected, tree);
	}

	@Test
	public void emptyTree() {
		Integer[] tree = {};
		int expected = 0;
		assertSum(expected, tree);
	}

	@Test
	public void differentHeight() {
		Integer[] tree = { 1, 2, 3, 4 };
		int expected = 137;
		assertSum(expected, tree);
	}

}
