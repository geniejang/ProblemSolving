package leetcode.no501_FindModeInBST;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertCase(int[] expecteds, TreeNode root) {
		int[] actuals = solution.findMode(root);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(2);

		assertCase(new int[] { 2 }, root);
	}

	@Test
	public void emptyTree() {
		assertCase(new int[] {}, null);
	}

	@Test
	public void intMax() {
		TreeNode root = new TreeNode(Integer.MAX_VALUE);

		assertCase(new int[] { Integer.MAX_VALUE }, root);
	}

}
