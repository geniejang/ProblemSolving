package leetcode.no304_RangeSumQuery2dImmutable;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void exmple() {
		int[][] matrix = { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 },
				{ 1, 0, 3, 0, 5 } };
		NumMatrix numMatrix = new NumMatrix(matrix);
		assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
		assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
		assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
	}

	@Test
	public void emptyMatrix() {
		int[][] matrix = {};
		NumMatrix numMatrix = new NumMatrix(matrix);
		assertNotNull(numMatrix);
	}

}
