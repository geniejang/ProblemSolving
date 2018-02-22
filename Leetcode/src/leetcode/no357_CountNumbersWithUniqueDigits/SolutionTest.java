package leetcode.no357_CountNumbersWithUniqueDigits;

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

	private void assertUniques(int expected, int n) {
		int actual = solution.countNumbersWithUniqueDigits(n);
		assertEquals(expected, actual);
	}

	@Test
	public void zero() {
		int n = 0;
		int expected = 1;
		assertUniques(expected, n);
	}

	@Test
	public void one() {
		int n = 1;
		int expected = 10;
		assertUniques(expected, n);
	}

	@Test
	public void two() {
		int n = 2;
		int expected = 91;
		assertUniques(expected, n);
	}

	@Test
	public void three() {
		int n = 3;
		int expected = 739;
		assertUniques(expected, n);
	}

	@Test
	public void ten() {
		int n = 10;
		int expected = 8877691;
		assertUniques(expected, n);
	}

	@Test
	public void longerThan10() {
		int n = 72;
		int expected = 8877691;
		assertUniques(expected, n);
	}

}
