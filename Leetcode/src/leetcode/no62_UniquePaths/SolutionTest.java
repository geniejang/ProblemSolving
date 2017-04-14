package leetcode.no62_UniquePaths;

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

	private void assertPaths(int expected, int m, int n) {
		int actual = solution.uniquePaths(m, n);
		assertEquals(expected, actual);
	}

	@Test
	public void singleRow() {
		int m = 1;
		int n = 8;
		int expected = 1;
		assertPaths(expected, m, n);
	}

	@Test
	public void singleColumn() {
		int m = 100;
		int n = 1;
		int expected = 1;
		assertPaths(expected, m, n);
	}

	@Test
	public void nBiggerThanM() {
		int m = 3;
		int n = 7;
		int expected = 28;
		assertPaths(expected, m, n);
	}

	@Test
	public void mBiggerThanN() {
		int m = 7;
		int n = 3;
		int expected = 28;
		assertPaths(expected, m, n);
	}

}
