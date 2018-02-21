package leetcode.no221_MaximalSquare;

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

	private void assertSquare(int expected, char[][] matrix) {
		int actual = solution.maximalSquare2(matrix);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		int expected = 4;
		assertSquare(expected, matrix);
	}

	@Test
	public void emptyMatrix() {
		char[][] matrix = { {} };
		int expected = 0;
		assertSquare(expected, matrix);
	}

	@Test
	public void singleZero() {
		char[][] matrix = { { '0' } };
		int expected = 0;
		assertSquare(expected, matrix);
	}

	@Test
	public void singleOne() {
		char[][] matrix = { { '1' } };
		int expected = 1;
		assertSquare(expected, matrix);
	}

	@Test
	public void rectangleFilledWithOne() {
		char[][] matrix = { { '1', '1', '1', '1', '1' }, { '1', '1', '1', '1', '1' }, { '1', '1', '1', '1', '1' }, };
		int expected = 9;
		assertSquare(expected, matrix);
	}

}
