package leetcode.no070_ClimbingStairs;

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

	@Test
	public void one() {
		int n = 1;
		int expected = 1;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

	@Test
	public void two() {
		int n = 2;
		int expected = 2;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

	@Test
	public void three() {
		int n = 3;
		int expected = 3;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

	@Test
	public void four() {
		int n = 4;
		int expected = 5;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

}
