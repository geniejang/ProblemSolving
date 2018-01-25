package leetcode.no766_ToeplitzMatrix;

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

	private void assertToeplitz(boolean expected, int[][] matrix) {
		boolean actual = solution.isToeplitzMatrix(matrix);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		boolean expected = true;
		assertToeplitz(expected, matrix);
	}

	@Test
	public void example2() {
		int[][] matrix = { { 1, 2 }, { 2, 2 } };
		boolean expected = false;
		assertToeplitz(expected, matrix);
	}

}
