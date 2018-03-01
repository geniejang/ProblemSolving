package leetcode.no508_MostFrequentSubtreeSum;

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

	private void assertFrequentSubtreeSum(int[] expecteds, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		int[] actuals = solution.findFrequentTreeSum(root);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void emptyTree() {
		Integer[] tree = {};
		int[] expecteds = {};
		assertFrequentSubtreeSum(expecteds, tree);
	}

	@Test
	public void singleRoot() {
		Integer[] tree = { 1 };
		int[] expecteds = { 1 };
		assertFrequentSubtreeSum(expecteds, tree);
	}

	@Test
	public void example1() {
		Integer[] tree = { 5, 2, -3 };
		int[] expecteds = { 2, -3, 4 };
		assertFrequentSubtreeSum(expecteds, tree);
	}

	@Test
	public void example2() {
		Integer[] tree = { 5, 2, -5 };
		int[] expecteds = { 2 };
		assertFrequentSubtreeSum(expecteds, tree);
	}

}
