package leetcode.no053_MaximumSubarray;

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
	public void test() {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int expected = 6;
		int actual = solution.maxSubArray(nums);
		assertEquals(expected, actual);
	}

}
