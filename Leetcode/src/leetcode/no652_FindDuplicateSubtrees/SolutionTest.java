package leetcode.no652_FindDuplicateSubtrees;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
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

	private void assertDuplicates(List<TreeNode> expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		List<TreeNode> actual = solution.findDuplicateSubtrees(root);
		assertThat(actual, IsIterableContainingInAnyOrder.containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void nullRoot() {
		Integer[] tree = {};
		List<TreeNode> expected = List.of();
		assertDuplicates(expected, tree);
	}

	@Test
	public void singleRoot() {
		Integer[] tree = { 1 };
		List<TreeNode> expected = List.of();
		assertDuplicates(expected, tree);
	}

	@Test
	public void sameChildren() {
		Integer[] tree = { 1, 2, 2 };
		List<TreeNode> expected = List.of(new TreeNode(2));
		assertDuplicates(expected, tree);
	}

	@Test
	public void sameVluesButDifferentChildrens() {
		Integer[] tree = { 1, 2, 1 };
		List<TreeNode> expected = List.of();
		assertDuplicates(expected, tree);
	}

	@Test
	public void example() {
		Integer[] tree = { 1, 2, 3, 4, null, 2, 4, null, null, null, null, 4 };
		List<TreeNode> expected = List.of(TreeNode.from(new Integer[] { 2, 4 }), new TreeNode(4));
		assertDuplicates(expected, tree);
	}

}
