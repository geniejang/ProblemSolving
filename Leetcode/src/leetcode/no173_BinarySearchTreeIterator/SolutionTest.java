package leetcode.no173_BinarySearchTreeIterator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	@Before
	public void init() {
	}

	private void assertIterator(Integer[] tree) {
		BSTIterator iter = new BSTIterator(TreeNode.from(tree));
		Integer[] sorted = Arrays.copyOf(tree, tree.length);
		Arrays.sort(sorted, (a, b) -> a == null ? a == b ? 0 : b : b == null ? a : (a - b));
		int i = 0;
		while (iter.hasNext()) {
			int val = iter.next();
			int expected = sorted[i++];
			assertEquals(expected, val);
		}
		assertFalse(iter.hasNext());
	}

	@Test
	public void nullTree() {
		Integer[] nums = {};
		assertIterator(nums);
	}

	@Test
	public void fullTree() {
		Integer[] nums = { 4, 2, 6, 1, 3, 5, 7 };
		assertIterator(nums);
	}

	@Test
	public void singleNode() {
		Integer[] nums = { 1 };
		assertIterator(nums);
	}

	@Test
	public void nullChildren() {
		Integer[] nums = { 4, 2, 6, 1, null, null, null };
		assertIterator(nums);
	}

}
