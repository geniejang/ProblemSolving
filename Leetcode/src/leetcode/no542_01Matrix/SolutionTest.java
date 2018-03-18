package leetcode.no542_01Matrix;

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

	private void assertDist(int[][] expecteds, int[][] matrix) {
		int[][] actuals = solution.updateMatrixDP(matrix);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void example1() {
		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] expecteds = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		assertDist(expecteds, matrix);
	}

	@Test
	public void example2() {
		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] expecteds = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 } };
		assertDist(expecteds, matrix);
	}

}
