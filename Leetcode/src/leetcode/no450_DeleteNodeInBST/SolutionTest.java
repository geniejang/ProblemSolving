package leetcode.no450_DeleteNodeInBST;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

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

	private void assertDeleted(TreeNode expected1, TreeNode expected2, TreeNode root, int key) {
		TreeNode actual = solution.deleteNode(root, key);
		assertThat(actual, anyOf(is(expected1), is(expected2)));
	}

	@Test
	public void example() {
		TreeNode root = TreeNode.from(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		int key = 3;
		TreeNode expected1 = TreeNode.from(new Integer[] { 5, 4, 6, 2, null, null, 7 });
		TreeNode expected2 = TreeNode.from(new Integer[] { 5, 2, 6, null, 4, null, 7 });
		assertDeleted(expected1, expected2, root, key);
	}

	@Test
	public void singleDeleted() {
		TreeNode root = TreeNode.from(new Integer[] { 3 });
		int key = 3;
		TreeNode expected1 = null;
		TreeNode expected2 = null;
		assertDeleted(expected1, expected2, root, key);
	}

	@Test
	public void singleRemained() {
		TreeNode root = new TreeNode(3);
		int key = 4;
		TreeNode expected1 = new TreeNode(3);
		TreeNode expected2 = null;
		assertDeleted(expected1, expected2, root, key);
	}

	@Test
	public void rootDeleted() {
		TreeNode root = TreeNode.from(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		int key = 5;
		TreeNode expected1 = TreeNode.from(new Integer[] { 4, 3, 6, 2, null, null, 7 });
		TreeNode expected2 = TreeNode.from(new Integer[] { 6, 3, 7, 2, 4, null, null });
		assertDeleted(expected1, expected2, root, key);
	}

	@Test
	public void noChild() {
		TreeNode root = TreeNode.from(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		int key = 2;
		TreeNode expected1 = TreeNode.from(new Integer[] { 5, 3, 6, null, 4, null, 7 });
		TreeNode expected2 = null;
		assertDeleted(expected1, expected2, root, key);
	}

	@Test
	public void singleChild() {
		TreeNode root = TreeNode.from(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		int key = 6;
		TreeNode expected1 = TreeNode.from(new Integer[] { 5, 3, 7, 2, 4, null, null });
		TreeNode expected2 = null;
		assertDeleted(expected1, expected2, root, key);
	}

}
