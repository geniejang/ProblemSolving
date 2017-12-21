package leetcode.no048_RotateImage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
	public void twoByTwo() {
		int[][] matrix = { { 1, 2, }, { 3, 4 } };
		int[][] expecteds = { { 3, 1 }, { 4, 2 } };
		solution.rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			assertArrayEquals(expecteds[i], matrix[i]);
		}
	}

	@Test
	public void threeByThree() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] expecteds = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		solution.rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			assertArrayEquals(expecteds[i], matrix[i]);
		}
	}

}
