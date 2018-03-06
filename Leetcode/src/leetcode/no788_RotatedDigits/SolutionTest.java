package leetcode.no788_RotatedDigits;

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

	private void assertRotated(int expected, int N) {
		int actual = solution.rotatedDigits(N);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int N = 10;
		int expected = 4;
		assertRotated(expected, N);
	}

	@Test
	public void to1() {
		int N = 1;
		int expected = 0;
		assertRotated(expected, N);
	}

	@Test
	public void to20() {
		int N = 20;
		int expected = 9;
		assertRotated(expected, N);
	}

	@Test
	public void to30() {
		int N = 30;
		int expected = 15;
		assertRotated(expected, N);
	}

	@Test
	public void to50() {
		int N = 50;
		int expected = 16;
		assertRotated(expected, N);
	}

	@Test
	public void to10000() {
		int N = 10000;
		int expected = 2320;
		assertRotated(expected, N);
	}

}
