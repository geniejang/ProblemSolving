package leetcode.no378_KthSmallestElementInSortedMatrix;

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

	private void assertMin(int expected, int[][] matrix, int k) {
		int actual = solution.kthSmallest(matrix, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		int expected = 13;
		assertMin(expected, matrix, k);
	}

}
