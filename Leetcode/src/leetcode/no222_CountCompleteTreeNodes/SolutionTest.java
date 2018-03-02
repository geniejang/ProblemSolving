package leetcode.no222_CountCompleteTreeNodes;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	private SolutionIter solution;

	@Before
	public void setUp() throws Exception {
		solution = new SolutionIter();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertNodes(int expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		for (int i = 0; i < 100000; i++) {
			int actual = solution.countNodes(root);
			assertEquals(expected, actual);
		}
	}

	@Test
	public void emptyTree() {
		Integer[] tree = {};
		int expected = 0;
		assertNodes(expected, tree);
	}

	@Test
	public void singleRoot() {
		Integer[] tree = { 1 };
		int expected = 1;
		assertNodes(expected, tree);
	}

	@Test
	public void full() {
		Integer[] tree = { 1, 2, 3 };
		int expected = 3;
		assertNodes(expected, tree);
	}

	@Test
	public void notFull() {
		Integer[] tree = { 1, 2 };
		int expected = 2;
		assertNodes(expected, tree);
	}

	@Test(timeout = 200)
	public void largeTree() {
		Integer[] tree = new Integer[1000000];
		Arrays.setAll(tree, i -> i);
		int expected = 1000000;
		assertNodes(expected, tree);
	}

}
