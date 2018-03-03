package leetcode.no655_PrintBinaryTree;

import static org.junit.Assert.*;

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

	private void assertPrint(List<List<String>> expected, TreeNode root) {
		List<List<String>> actual = solution.printTree2(root);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		TreeNode root = TreeNode.from(1, 2);
		List<List<String>> expected = List.of(
				List.of("", "1", ""),
				List.of("2", "", ""));
		assertPrint(expected, root);
	}

	@Test
	public void example2() {
		TreeNode root = TreeNode.from(1, 2, 3, null, 4);
		List<List<String>> expected = List.of(
				List.of("", "", "", "1", "", "", ""),
				List.of("", "2", "", "", "", "3", ""),
				List.of("", "", "4", "", "", "", ""));
		assertPrint(expected, root);
	}

	@Test
	public void example3() {
		TreeNode root = TreeNode.from(1, 2, 5, 3, null, null, null, 4);
		List<List<String>> expected = List.of(
				List.of("", "", "", "", "", "", "", "1", "", "", "", "", "", "", ""),
				List.of("", "", "", "2", "", "", "", "", "", "", "", "5", "", "", ""),
				List.of("", "3", "", "", "", "", "", "", "", "", "", "", "", "", ""),
				List.of("4", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		assertPrint(expected, root);
	}

	@Test
	public void example4() {
		TreeNode root = TreeNode.from(3, 1, 5, 0, 2, 4, 6, null, null, null, 3);
		List<List<String>> expected = List.of(
				List.of("", "", "", "", "", "", "", "3", "", "", "", "", "", "", ""),
				List.of("", "", "", "1", "", "", "", "", "", "", "", "5", "", "", ""),
				List.of("", "0", "", "", "", "2", "", "", "", "4", "", "", "", "6", ""),
				List.of("", "", "", "", "", "", "3", "", "", "", "", "", "", "", ""));
		assertPrint(expected, root);
	}

	@Test
	public void singleRoot() {
		TreeNode root = TreeNode.from(1);
		List<List<String>> expected = List.of(List.of("1"));
		assertPrint(expected, root);
	}

	@Test
	public void skewed() {
		TreeNode root = TreeNode.from(1, 2, null, 3, null, null, null, 4, null, null, null, null, null, null, null, 5);
		List<List<String>> expected = List.of(
				List.of("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "1", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", ""),
				List.of("", "", "", "", "", "", "", "2", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", ""),
				List.of("", "", "", "3", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", ""),
				List.of("", "4", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", ""),
				List.of("5", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", ""));
		assertPrint(expected, root);
	}

}
