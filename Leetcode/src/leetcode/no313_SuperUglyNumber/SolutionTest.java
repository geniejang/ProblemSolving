package leetcode.no313_SuperUglyNumber;

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

	private void assertSuperUglyNumber(int expected, int n, int[] primes) {
		int actual = solution.nthSuperUglyNumber(n, primes);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int n = 12;
		int[] primes = { 2, 7, 13, 19 };
		int expected = 32;
		assertSuperUglyNumber(expected, n, primes);
	}

	@Test
	public void firstIsAlwaysOne() {
		int n = 1;
		int[] primes = { 2, 3, 5 };
		int expected = 1;
		assertSuperUglyNumber(expected, n, primes);
	}

}
