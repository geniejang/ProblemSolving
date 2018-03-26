package leetcode.no329_LongestPathInMatrix;

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

	private void assertLongestPath(int expected, int[][] matrix) {
		int actual = solution.longestIncreasingPath(matrix);
		assertEquals(expected, actual);
	}

	@Test
	public void empty() {
		int[][] matrix = { {} };
		int expected = 0;
		assertLongestPath(expected, matrix);
	}

	@Test
	public void singleCell() {
		int[][] matrix = { { 7 } };
		int expected = 1;
		assertLongestPath(expected, matrix);
	}

	@Test
	public void example1() {
		int[][] matrix = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
		int expected = 4;
		assertLongestPath(expected, matrix);
	}

	@Test
	public void example2() {
		int[][] matrix = { { 3, 4, 5 }, { 3, 2, 6 }, { 2, 2, 1 } };
		int expected = 4;
		assertLongestPath(expected, matrix);
	}

}
