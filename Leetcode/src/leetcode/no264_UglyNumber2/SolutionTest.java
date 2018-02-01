package leetcode.no264_UglyNumber2;

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

	private void assertUglyNumber(int expected, int n) {
		int actual = solution.nthUglyNumber(n);
		assertEquals(expected, actual);
	}

	@Test
	public void seventh() {
		int n = 7;
		int expected = 8;
		assertUglyNumber(expected, n);
	}

	@Test
	public void tenth() {
		int n = 10;
		int expected = 12;
		assertUglyNumber(expected, n);
	}

	@Test
	public void eleventh() {
		int n = 11;
		int expected = 15;
		assertUglyNumber(expected, n);
	}

	@Test
	public void maximum() {
		int n = 1690;
		int expected = 2123366400;
		assertUglyNumber(expected, n);
	}

}
