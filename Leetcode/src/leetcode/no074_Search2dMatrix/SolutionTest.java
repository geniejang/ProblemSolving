package leetcode.no074_Search2dMatrix;

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

	private void assertSearch(boolean expected, int[][] matrix, int target) {
		boolean actual = solution.searchMatrix(matrix, target);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int target = 3;
		boolean expected = true;
		assertSearch(expected, matrix, target);
	}

}
