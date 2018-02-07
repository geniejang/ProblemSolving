package leetcode.no743_NetworkDelayTime;

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

	private void assertDelayTime(int expected, int[][] times, int N, int K) {
		int actual = solution.networkDelayTime(times, N, K);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] times = { { 2, 1, 1 }, { 2, 3, 1 }, { 3, 4, 1 } };
		int N = 4;
		int K = 2;
		int expected = 2;
		assertDelayTime(expected, times, N, K);
	}

	@Test
	public void example2() {
		int[][] times = { { 3, 5, 78 }, { 2, 1, 1 }, { 1, 3, 0 }, { 4, 3, 59 }, { 5, 3, 85 }, { 5, 2, 22 },
				{ 2, 4, 23 }, { 1, 4, 43 }, { 4, 5, 75 }, { 5, 1, 15 }, { 1, 5, 91 }, { 4, 1, 16 }, { 3, 2, 98 },
				{ 3, 4, 22 }, { 5, 4, 31 }, { 1, 2, 0 }, { 2, 5, 4 }, { 4, 2, 51 }, { 3, 1, 36 }, { 2, 3, 59 } };
		int N = 5;
		int K = 5;
		int expected = 31;
		assertDelayTime(expected, times, N, K);
	}

	@Test
	public void example3() {
		int[][] times = { { 4, 2, 76 }, { 1, 3, 79 }, { 3, 1, 81 }, { 4, 3, 30 }, { 2, 1, 47 }, { 1, 5, 61 },
				{ 1, 4, 99 }, { 3, 4, 68 }, { 3, 5, 46 }, { 4, 1, 6 }, { 5, 4, 7 }, { 5, 3, 44 }, { 4, 5, 19 },
				{ 2, 3, 13 }, { 3, 2, 18 }, { 1, 2, 0 }, { 5, 1, 25 }, { 2, 5, 58 }, { 2, 4, 77 }, { 5, 2, 74 } };
		int N = 5;
		int K = 3;
		int expected = 59;
		assertDelayTime(expected, times, N, K);
	}

}
