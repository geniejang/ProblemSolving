package leetcode.no116_PopulatingNextRightPointersInEachNode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.TreeLinkNode;

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

	private void assertConnected(TreeLinkNode expected, Integer[] tree) {
		TreeLinkNode root = TreeLinkNode.from(tree);
		solution.connectBFS(root);
		assertEquals(expected, root);
	}

	@Test
	public void singleRoot() {
		Integer[] tree = { 1 };
		TreeLinkNode expected = TreeLinkNode.from(tree);
		assertConnected(expected, tree);
	}

	@Test
	public void twoDepth() {
		Integer[] tree = { 1, 2, 3 };
		TreeLinkNode expected = TreeLinkNode.from(tree);
		expected.left.next = expected.right;
		assertConnected(expected, tree);
	}

	@Test
	public void example() {
		Integer[] tree = { 1, 2, 3, 4, 5, 6, 7 };
		TreeLinkNode expected = TreeLinkNode.from(tree);
		expected.left.next = expected.right;
		expected.left.left.next = expected.left.right;
		expected.left.right.next = expected.right.left;
		expected.right.left.next = expected.right.right;
		assertConnected(expected, tree);
	}

}
