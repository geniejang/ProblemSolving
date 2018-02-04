package leetcode.no052_NQueens2;

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

	private void assertQueens(int expected, int n) {
		int actual = solution.totalNQueens(n);
		assertEquals(expected, actual);
	}

	@Test
	public void n1() {
		int n = 1;
		int expected = 1;
		assertQueens(expected, n);
	}

	@Test
	public void n2() {
		int n = 2;
		int expected = 0;
		assertQueens(expected, n);
	}

	@Test
	public void n3() {
		int n = 3;
		int expected = 0;
		assertQueens(expected, n);
	}

	@Test
	public void n4() {
		int n = 4;
		int expected = 2;
		assertQueens(expected, n);
	}

	@Test
	public void n8() {
		int n = 8;
		int expected = 92;
		assertQueens(expected, n);
	}

}
