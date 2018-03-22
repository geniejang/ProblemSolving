package leetcode.no372_SuperPow;

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

	private void assertPower(int expected, int a, int[] b) {
		int actual = solution.superPow(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void power0() {
		int a = 7;
		int[] b = { 0 };
		int expected = 1;
		assertPower(expected, a, b);
	}

	@Test
	public void example1() {
		int a = 2;
		int[] b = { 3 };
		int expected = 8;
		assertPower(expected, a, b);
	}

	@Test
	public void example2() {
		int a = 2;
		int[] b = { 1, 0 };
		int expected = 1024;
		assertPower(expected, a, b);
	}

	@Test
	public void twelve() {
		int a = 2;
		int[] b = { 1, 2 };
		int expected = 85;
		assertPower(expected, a, b);
	}

	@Test
	public void intMax() {
		int a = Integer.MAX_VALUE;
		int[] b = { 2, 0, 0 };
		int expected = 1198;
		assertPower(expected, a, b);
	}

}
