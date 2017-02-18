package leetcode.no515_FindLargestValueInEachTreeRow;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import leetcode.TreeNode;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	@Test
	public void threeLevels() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(9);

		Integer[] expectedsArr = { 1, 3, 9 };
		List<Integer> expecteds = Arrays.asList(expectedsArr);
		List<Integer> actuals = solution.largestValues(root);
		assertArrayEquals(expecteds.toArray(), actuals.toArray());
	}

}
