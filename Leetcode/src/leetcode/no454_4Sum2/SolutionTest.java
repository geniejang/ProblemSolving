package leetcode.no454_4Sum2;

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

	private void assert4Sum(int expected, int[] A, int[] B, int[] C, int[] D) {
		int actual = solution.fourSumCount(A, B, C, D);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] A = { 1, 2 };
		int[] B = { -2, -1 };
		int[] C = { -1, 2 };
		int[] D = { 0, 2 };
		int expected = 2;
		assert4Sum(expected, A, B, C, D);
	}

}
