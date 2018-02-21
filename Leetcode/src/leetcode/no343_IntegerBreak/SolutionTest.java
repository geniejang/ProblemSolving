package leetcode.no343_IntegerBreak;

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

	private void assertBreak(int expected, int n) {
		int actual = solution.integerBreak(n);
		assertEquals(expected, actual);
	}

	@Test
	public void two() {
		int n = 2;
		int expected = 1;
		assertBreak(expected, n);
	}

	@Test
	public void three() {
		int n = 3;
		int expected = 2;
		assertBreak(expected, n);
	}

	@Test
	public void four() {
		int n = 4;
		int expected = 4;
		assertBreak(expected, n);
	}

	@Test
	public void five() {
		int n = 5;
		int expected = 6;
		assertBreak(expected, n);
	}

	@Test
	public void six() {
		int n = 6;
		int expected = 9;
		assertBreak(expected, n);
	}

	@Test
	public void eight() {
		int n = 8;
		int expected = 18;
		assertBreak(expected, n);
	}

	@Test
	public void nine() {
		int n = 9;
		int expected = 27;
		assertBreak(expected, n);
	}

	@Test
	public void ten() {
		int n = 10;
		int expected = 36;
		assertBreak(expected, n);
	}

}
