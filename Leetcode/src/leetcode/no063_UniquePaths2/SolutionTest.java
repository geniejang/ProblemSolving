package leetcode.no063_UniquePaths2;

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

	private void assertPaths(int expected, int[][] obstacleGrid) {
		int actual = solution.uniquePathsWithObstaclesOptimized(obstacleGrid);
		assertEquals(expected, actual);
	}

	@Test
	public void twoPaths() {
		int[][] map = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int expected = 2;
		assertPaths(expected, map);
	}

	@Test
	public void noPath() {
		int[][] map = { { 1, 0 } };
		int expected = 0;
		assertPaths(expected, map);
	}

	@Test
	public void noPath2() {
		int[][] map = { { 0, 1 }, { 0, 0 }, { 0, 0 } };
		int expected = 2;
		assertPaths(expected, map);
	}

}
