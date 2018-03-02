package leetcode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TreeNodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void equalsAgainstSameValuedNodes() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(1);
		assertEquals(n2, n1);
	}

	@Test
	public void equalsAgainstDifferentValuedNodes() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		assertNotEquals(n2, n1);
	}

	@Test
	public void euqlasAgainstSameValuedChildren() {
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(3);
		n1.right = new TreeNode(8);
		TreeNode n2 = new TreeNode(1);
		n2.left = new TreeNode(3);
		n2.right = new TreeNode(8);
		assertEquals(n2, n1);
	}

	@Test
	public void euqlasAgainstDifferentValuedChildren() {
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(3);
		n1.right = new TreeNode(8);
		TreeNode n2 = new TreeNode(1);
		n2.left = new TreeNode(5);
		n2.right = new TreeNode(8);
		assertNotEquals(n2, n1);
	}

	@Test
	public void fromIntegerArray() {
		TreeNode expected = new TreeNode(0);
		expected.left = new TreeNode(1);
		expected.right = new TreeNode(2);
		expected.left.left = new TreeNode(3);
		expected.left.right = new TreeNode(4);
		expected.right.right = new TreeNode(6);
		expected.left.left.right = new TreeNode(8);
		TreeNode actual = TreeNode.from(0, 1, 2, 3, 4, null, 6, null, 8);
		assertEquals(expected, actual);
	}

	private void assertSort(TreeNode n1, TreeNode n2) {
		List<TreeNode> list1 = new ArrayList<>();
		list1.add(n1);
		list1.add(n2);
		Collections.sort(list1, TreeNode.COMPARATOR);
		List<TreeNode> list2 = new LinkedList<>();
		list2.add(n2);
		list2.add(n1);
		Collections.sort(list2, TreeNode.COMPARATOR);
		assertEquals(list1, list2);
	}

	@Test
	public void sortSingleNodes() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(3);
		assertSort(n1, n2);
	}

	@Test
	public void sortTreesSameRootDifferentLeft() {
		TreeNode t1 = TreeNode.from(3, 2);
		TreeNode t2 = TreeNode.from(3, 1);
		assertSort(t1, t2);
	}

	@Test
	public void sortTreesSameRootSameLeftDifferentRight() {
		TreeNode t1 = TreeNode.from(3, 2, 5);
		TreeNode t2 = TreeNode.from(3, 2, 7);
		assertSort(t1, t2);
	}
}
