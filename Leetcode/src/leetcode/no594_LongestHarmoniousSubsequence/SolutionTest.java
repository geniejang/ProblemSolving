package leetcode.no594_LongestHarmoniousSubsequence;

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
	public void five() {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		int expected = 5;
		int actual = solution.findLHS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void allOne() {
		int[] nums = { 1, 1, 1, 1 };
		int expected = 0;
		int actual = solution.findLHS(nums);
		assertEquals(expected, actual);
	}

}
