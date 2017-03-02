package leetcode.no529_Minesweeper;

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
	public void clickEmpty() {
		char[][] board = {
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', 'E', 'M', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' }
		};
		int[] click = { 3, 0 };
		char[][] expecteds = {
				{ 'B', '1', 'E', '1', 'B' },
				{ 'B', '1', 'M', '1', 'B' },
				{ 'B', '1', '1', '1', 'B' },
				{ 'B', 'B', 'B', 'B', 'B' }
		};
		char[][] actuals = solution.updateBoard(board, click);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void clickNumber() {
		char[][] board = {
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', 'E', 'M', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' }
		};
		int[] click = { 1, 1 };
		char[][] expecteds = {
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', '1', 'M', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' },
				{ 'E', 'E', 'E', 'E', 'E' }
		};
		char[][] actuals = solution.updateBoard(board, click);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void clickMine() {
		char[][] board = {
				{ 'B', '1', 'E', '1', 'B' },
				{ 'B', '1', 'M', '1', 'B' },
				{ 'B', '1', '1', '1', 'B' },
				{ 'B', 'B', 'B', 'B', 'B' }
		};
		int[] click = { 1, 2 };
		char[][] expecteds = {
				{ 'B', '1', 'E', '1', 'B' },
				{ 'B', '1', 'X', '1', 'B' },
				{ 'B', '1', '1', '1', 'B' },
				{ 'B', 'B', 'B', 'B', 'B' }
		};
		char[][] actuals = solution.updateBoard(board, click);
		assertArrayEquals(expecteds, actuals);
	}

}
