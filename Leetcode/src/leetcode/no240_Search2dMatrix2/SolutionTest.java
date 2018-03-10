package leetcode.no240_Search2dMatrix2;

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

	private void assertContains(boolean expected, int[][] matrix, int target) {
		boolean actual = solution.searchMatrix2(matrix, target);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] matrix = {
				{ 1, 4, 7, 11, 15 },
				{ 2, 5, 8, 12, 19 },
				{ 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 }
		};
		int target = 5;
		boolean expected = true;
		assertContains(expected, matrix, target);
	}

	@Test
	public void example2() {
		int[][] matrix = {
				{ 1, 4, 7, 11, 15 },
				{ 2, 5, 8, 12, 19 },
				{ 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 }
		};
		int target = 20;
		boolean expected = false;
		assertContains(expected, matrix, target);
	}

}
