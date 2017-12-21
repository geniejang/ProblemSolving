package leetcode.no095_UniqueBinarySearchTrees2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
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

	private void assertTrees(List<TreeNode> expected, int n) {
		List<TreeNode> actual = solution.generateTrees(n);
		assertNotNull(actual);
		Collections.sort(actual, TreeNode.COMPARATOR);
		Collections.sort(expected, TreeNode.COMPARATOR);
		assertEquals(expected, actual);
	}

	@Test
	public void zero() {
		int n = 0;
		List<TreeNode> expected = new ArrayList<>();
		assertTrees(expected, n);
	}

	@Test
	public void three() {
		int n = 3;
		List<TreeNode> expected = new ArrayList<>();
		Integer[][] input = {
				{ 1, null, 2, null, null, null, 3 },
				{ 1, null, 3, null, null, 2 },
				{ 2, 1, 3 },
				{ 3, 1, null, null, 2 },
				{ 3, 2, null, 1 }
		};
		for (Integer[] tree : input) {
			expected.add(TreeNode.from(tree));
		}
		assertTrees(expected, n);
	}

}
