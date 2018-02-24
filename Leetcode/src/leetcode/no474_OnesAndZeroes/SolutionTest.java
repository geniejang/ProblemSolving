package leetcode.no474_OnesAndZeroes;

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

	private void assertMaxForm(int expected, String[] strs, int m, int n) {
		int actual = solution.findMaxForm(strs, m, n);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String[] strs = { "10", "0001", "111001", "1", "0" };
		int m = 5;
		int n = 3;
		int expected = 4;
		assertMaxForm(expected, strs, m, n);
	}

	@Test
	public void example2() {
		String[] strs = { "10", "0", "1" };
		int m = 1;
		int n = 1;
		int expected = 2;
		assertMaxForm(expected, strs, m, n);
	}

}
