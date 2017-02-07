package leetcode.no463_IslandPerimeter;

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
	public void grid4x4() {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		assertEquals(16, solution.islandPerimeter(grid));
	}

	@Test
	public void grid1x2() {
		int[][] grid = { { 0, 1 } };
		assertEquals(4, solution.islandPerimeter(grid));
	}
}
