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

	private void assertSum(int expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		int actual = solution.sumOfLeftLeaves(root);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
		int expected = 24;
		assertSum(expected, tree);
	}

	@Test
	public void test2() {
		Integer[] tree = { 1, 2, 3, 4, 5 };
		int expected = 4;
		assertSum(expected, tree);
	}

}
