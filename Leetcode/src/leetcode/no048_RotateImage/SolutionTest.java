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

	private void assertRotate(int[][] expecteds, int[][] matrix) {
		solution.rotate(matrix);
		assertArrayEquals(expecteds, matrix);
	}

	@Test
	public void oneByOne() {
		int[][] matrix = { { 1 } };
		int[][] expecteds = { { 1 } };
		assertRotate(expecteds, matrix);
	}

	@Test
	public void twoByTwo() {
		int[][] matrix = { { 1, 2, }, { 3, 4 } };
		int[][] expecteds = { { 3, 1 }, { 4, 2 } };
		assertRotate(expecteds, matrix);
	}

	@Test
	public void threeByThree() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] expecteds = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		assertRotate(expecteds, matrix);
	}

	@Test
	public void fourByFour() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] expecteds = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
		assertRotate(expecteds, matrix);
	}

	@Test
	public void fiveByFive() {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] expecteds = { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 }, { 23, 18, 13, 8, 3 }, { 24, 19, 14, 9, 4 },
				{ 25, 20, 15, 10, 5 } };
		assertRotate(expecteds, matrix);
	}

}
