package leetcode.no738_MonotoneIncreasingDigits;

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

	private void assertMonotone(int expected, int N) {
		int actual = solution.monotoneIncreasingDigits(N);
		assertEquals(expected, actual);
	}

	@Test
	public void ten() {
		int N = 10;
		int expected = 9;
		assertMonotone(expected, N);
	}

	@Test
	public void monotone() {
		int N = 1234;
		int expected = 1234;
		assertMonotone(expected, N);
	}

	@Test
	public void example() {
		int N = 332;
		int expected = 299;
		assertMonotone(expected, N);
	}

}
