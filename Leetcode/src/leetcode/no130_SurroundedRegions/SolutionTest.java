package leetcode.no130_SurroundedRegions;

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
	public void example() {
		char[][] board = {
				{ 'X', 'X', 'X', 'X' },
				{ 'X', 'O', 'O', 'X' },
				{ 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' }
		};
		char[][] expected = {
				{ 'X', 'X', 'X', 'X' },
				{ 'X', 'X', 'X', 'X' },
				{ 'X', 'X', 'X', 'X' },
				{ 'X', 'O', 'X', 'X' }
		};
		solution.solve(board);
		assertArrayEquals(expected, board);
	}

}
