package leetcode.no566_ReshapeTheMatrix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void fourByOneFromTwoByTwo() {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int c = 4;
		int r = 1;
		int[][] expecteds = { { 1, 2, 3, 4 } };
		int[][] actuals = solution.matrixReshape(nums, r, c);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void unavaiable() {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int c = 4;
		int r = 2;
		int[][] expecteds = nums;
		int[][] actuals = solution.matrixReshape(nums, r, c);
		assertArrayEquals(expecteds, actuals);
	}

}
