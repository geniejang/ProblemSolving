package leetcode.no107_BinaryTreeLevelOrderTraversal2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
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
		TreeNode root = TreeNode.from(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		List<List<Integer>> expected = new LinkedList<>();
		expected.add(Arrays.asList(new Integer[] { 15, 7 }));
		expected.add(Arrays.asList(new Integer[] { 9, 20 }));
		expected.add(Arrays.asList(new Integer[] { 3 }));
		List<List<Integer>> actual = solution.levelOrderBottom(root);
		assertEquals(expected, actual);
	}

}
