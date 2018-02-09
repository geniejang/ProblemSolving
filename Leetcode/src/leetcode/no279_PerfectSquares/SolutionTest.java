package leetcode.no279_PerfectSquares;

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

	private void assertSquares(int expected, int n) {
		int actual = solution.numSquares(n);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int n = 12;
		int expected = 3;
		assertSquares(expected, n);
	}

	@Test
	public void one() {
		int n = 1;
		int expected = 1;
		assertSquares(expected, n);
	}

	@Test
	public void twiceOfNine() {
		int n = 18;
		int expected = 2;
		assertSquares(expected, n);
	}

}
