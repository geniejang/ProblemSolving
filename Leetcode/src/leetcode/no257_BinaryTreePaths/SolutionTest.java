package leetcode.no257_BinaryTreePaths;

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

	private void assertPaths(String[] expecteds, TreeNode root) {
		List<String> expected = Arrays.asList(expecteds);
		List<String> actual = solution.binaryTreePaths(root);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		for (int i = 0; i < 1000000; i++) {
			TreeNode root = TreeNode.from(new Integer[] { 1, 2, 3, null, 5 });
			String[] expecteds = { "1->2->5", "1->3" };
			assertPaths(expecteds, root);
		}
	}

}
