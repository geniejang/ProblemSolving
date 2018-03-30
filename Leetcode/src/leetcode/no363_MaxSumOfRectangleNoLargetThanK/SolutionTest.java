package leetcode.no363_MaxSumOfRectangleNoLargetThanK;

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

	private void assertMaxSum(int expected, int[][] matrix, int k) {
		int actual = solution.maxSumSubmatrix(matrix, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[][] matrix = { { 1, 0, 1 }, { 0, -2, 3 } };
		int k = 2;
		int expected = 2;
		assertMaxSum(expected, matrix, k);
	}

	@Test
	public void singleRow() {
		int[][] matrix = { { 1, 0, 1, 2, -2, 3 } };
		int k = 5;
		int expected = 5;
		assertMaxSum(expected, matrix, k);
	}

	@Test
	public void bigElement() {
		int[][] matrix = { { 1, 0, 1, 8, -2, 3 } };
		int k = 5;
		int expected = 3;
		assertMaxSum(expected, matrix, k);
	}

}
