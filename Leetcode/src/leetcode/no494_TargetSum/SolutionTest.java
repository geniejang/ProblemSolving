package leetcode.no494_TargetSum;

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

	private void assertTargetSum(int expected, int[] nums, int S) {
		int actual = solution.findTargetSumWays(nums, S);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 1, 1, 1, 1, 1 };
		int S = 3;
		int expected = 5;
		assertTargetSum(expected, nums, S);
	}

	@Test(timeout = 20)
	public void example2() {
		int[] nums = { 2, 20, 24, 38, 44, 21, 45, 48, 30, 48, 14, 9, 21, 10, 46, 46, 12, 48, 12, 38 };
		int S = 48;
		int expected = 5401;
		assertTargetSum(expected, nums, S);
	}

}
