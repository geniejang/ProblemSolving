package leetcode.no775_GlobalAndLocalInversions;

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

	private void assertPermutation(boolean expected, int[] A) {
		boolean actual = solution.isIdealPermutation(A);
		assertEquals(expected, actual);
	}

	@Test
	public void smallMidBig() {
		int[] A = { 0, 1, 2 };
		boolean expected = true;
		assertPermutation(expected, A);
	}

	@Test
	public void smallBigMid() {
		int[] A = { 0, 2, 1 };
		boolean expected = true;
		assertPermutation(expected, A);
	}

	@Test
	public void midSmallBig() {
		int[] A = { 1, 0, 2 };
		boolean expected = true;
		assertPermutation(expected, A);
	}

	@Test
	public void midBigSmall() {
		int[] A = { 1, 2, 0 };
		boolean expected = false;
		assertPermutation(expected, A);
	}

	@Test
	public void bigSmallMid() {
		int[] A = { 2, 0, 1 };
		boolean expected = false;
		assertPermutation(expected, A);
	}

	@Test
	public void bigMidSmall() {
		int[] A = { 2, 1, 0 };
		boolean expected = false;
		assertPermutation(expected, A);
	}

}
