package leetcode.no718_MaximumLengthOfRepeatedSubarray;

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

	private void assertLength(int expected, int[] A, int[] B) {
		int actual = solution.findLengthDP(A, B);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] A = { 1, 2, 3, 2, 1 };
		int[] B = { 3, 2, 1, 4, 7 };
		int expected = 3;
		assertLength(expected, A, B);
	}

	@Test
	public void overlap1() {
		int[] A = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 };
		int[] B = { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		int expected = 9;
		assertLength(expected, A, B);
	}

	@Test
	public void overlap2() {
		int[] A = { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 };
		int[] B = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
		int expected = 9;
		assertLength(expected, A, B);
	}

	@Test
	public void complicated() {
		int[] A = { 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0,
				1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1,
				0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 };
		int[] B = { 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0,
				0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1,
				1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
		int expected = 13;
		assertLength(expected, A, B);
	}

}
