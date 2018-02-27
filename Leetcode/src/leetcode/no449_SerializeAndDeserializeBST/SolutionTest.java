package leetcode.no449_SerializeAndDeserializeBST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	private CodecWithPreorderTraversal solution;

	@Before
	public void setUp() throws Exception {
		solution = new CodecWithPreorderTraversal();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertCodec(TreeNode expected, Integer[] tree) {
		TreeNode root = TreeNode.from(tree);
		TreeNode actual = solution.deserialize(solution.serialize(root));
		assertEquals(expected, actual);
	}

	@Test
	public void nullRoot() {
		Integer[] tree = null;
		TreeNode expected = null;
		assertCodec(expected, tree);
	}

	@Test
	public void singleRoot() {
		Integer[] tree = { 7717 };
		TreeNode expected = new TreeNode(7717);
		assertCodec(expected, tree);
	}

	@Test
	public void tree() {
		Integer[] tree = { 5, 4, 7, 2, null, 6, 8, 1, 3 };
		TreeNode expected = TreeNode.from(tree);
		assertCodec(expected, tree);
	}

}
