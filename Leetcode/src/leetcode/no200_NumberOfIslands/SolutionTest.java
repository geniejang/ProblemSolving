package leetcode.no200_NumberOfIslands;

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

	private void assertIslands(int expected, char[][] grid) {
		int actual = solution.numIslands(grid);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		char[][] grid = {
				{ '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' }
		};
		int expected = 1;
		assertIslands(expected, grid);
	}

	@Test
	public void example2() {
		char[][] grid = {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' }
		};
		int expected = 3;
		assertIslands(expected, grid);
	}

}
