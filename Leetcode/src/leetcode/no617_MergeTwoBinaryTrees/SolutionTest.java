package leetcode.no617_MergeTwoBinaryTrees;

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
	public void test() {
		Integer[] t1 = { 1, 3, 2, 5 };
		Integer[] t2 = { 2, 1, 3, null, 4, null, 7 };
		TreeNode expected = TreeNode.from(new Integer[] { 3, 4, 5, 5, 4, null, 7 });
		TreeNode actual = solution.mergeTrees(TreeNode.from(t1), TreeNode.from(t2));
		assertEquals(expected, actual);
	}

}
