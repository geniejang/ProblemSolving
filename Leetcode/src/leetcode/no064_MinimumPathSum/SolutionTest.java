package leetcode.no064_MinimumPathSum;

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

	@Test
	public void test() {
		int[][] grid = {
				{ 1, 3, 5, 7, 2 },
				{ 2, 3, 1, 2, 5 },
				{ 1, 2, 1, 1, 1 },
				{ 4, 1, 3, 4, 1 }
			};
		int expected = 10;
		int actual = solution.minPathSum(grid);
		assertEquals(expected, actual);
	}

}
