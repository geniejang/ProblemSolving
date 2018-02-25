package leetcode.no576_OutOfBoundaryPaths;

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

	private void assertPaths(int m, int n, int N, int i, int j, int expected) {
		int actual = solution.findPaths2(m, n, N, i, j);
		assertEquals(expected, actual);
	}

	@Test
	public void noMoves() {
		int m = 2;
		int n = 2;
		int N = 0;
		int i = 0;
		int j = 0;
		int expected = 0;
		assertPaths(m, n, N, i, j, expected);
	}

	@Test
	public void example1() {
		int m = 2;
		int n = 2;
		int N = 2;
		int i = 0;
		int j = 0;
		int expected = 6;
		assertPaths(m, n, N, i, j, expected);
	}

	@Test
	public void example2() {
		int m = 1;
		int n = 3;
		int N = 3;
		int i = 0;
		int j = 1;
		int expected = 12;
		assertPaths(m, n, N, i, j, expected);
	}

	@Test
	public void worstcase() {
		int m = 50;
		int n = 50;
		int N = 50;
		int i = 5;
		int j = 5;
		int expected = 328857442;
		assertPaths(m, n, N, i, j, expected);
	}

}
