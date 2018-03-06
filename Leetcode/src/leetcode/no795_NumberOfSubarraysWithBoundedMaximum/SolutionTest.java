package leetcode.no795_NumberOfSubarraysWithBoundedMaximum;

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

	private void assertNum(int expected, int[] A, int L, int R) {
		int actual = solution.numSubarrayBoundedMax(A, L, R);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] A = { 2, 1, 4, 3 };
		int L = 2;
		int R = 3;
		int expected = 3;
		assertNum(expected, A, L, R);
	}

	@Test
	public void example2() {
		int[] A = { 2, 9, 2, 5, 6 };
		int L = 2;
		int R = 8;
		int expected = 7;
		assertNum(expected, A, L, R);
	}

	@Test
	public void example3() {
		int[] A = { 73, 55, 36, 5, 55, 14, 9, 7, 72, 52 };
		int L = 32;
		int R = 69;
		int expected = 22;
		assertNum(expected, A, L, R);
	}

	@Test
	public void noMatched() {
		int[] A = { 16, 69, 88, 85, 79, 87, 37, 33, 39, 34 };
		int L = 55;
		int R = 57;
		int expected = 0;
		assertNum(expected, A, L, R);
	}

}
