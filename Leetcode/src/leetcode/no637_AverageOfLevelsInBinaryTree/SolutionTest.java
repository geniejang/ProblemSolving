package leetcode.no637_AverageOfLevelsInBinaryTree;

import static org.junit.Assert.*;

import java.util.Arrays;
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

	@Test
	public void test() {
		TreeNode tree = TreeNode.from(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		List<Double> expected = Arrays.asList(new Double[] { 3., 14.5, 11. });
		List<Double> actual = solution.averageOfLevels(tree);
		assertEquals(expected, actual);
	}

}
