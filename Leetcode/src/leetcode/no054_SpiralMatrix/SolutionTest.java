package leetcode.no054_SpiralMatrix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

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

	private void assertSpiralOrder(List<Integer> expected, int[][] matrix) {
		List<Integer> actual = solution.spiralOrder(matrix);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
		assertSpiralOrder(expected, matrix);
	}

	@Test
	public void example2() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
		assertSpiralOrder(expected, matrix);
	}

	@Test
	public void empty() {
		int[][] matrix = { {} };
		List<Integer> expected = List.of();
		assertSpiralOrder(expected, matrix);
	}

}
