package leetcode.no787_CheapestFlightsWithinKStops;

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

	private void assertPrice(int expected, int n, int[][] flights, int src, int dst, int K) {
		int actual = solution.findCheapestPrice(n, flights, src, dst, K);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int n = 3;
		int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
		int src = 0;
		int dst = 2;
		int K = 1;
		int expected = 200;
		assertPrice(expected, n, flights, src, dst, K);
	}

	@Test
	public void example2() {
		int n = 3;
		int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
		int src = 0;
		int dst = 2;
		int K = 0;
		int expected = 500;
		assertPrice(expected, n, flights, src, dst, K);
	}

	@Test
	public void example3() {
		int n = 4;
		int[][] flights = { { 0, 1, 1 }, { 0, 2, 5 }, { 1, 2, 1 }, { 2, 3, 1 } };
		int src = 0;
		int dst = 3;
		int K = 1;
		int expected = 6;
		assertPrice(expected, n, flights, src, dst, K);
	}

}
