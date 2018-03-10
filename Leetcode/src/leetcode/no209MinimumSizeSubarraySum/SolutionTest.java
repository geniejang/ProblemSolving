package leetcode.no209MinimumSizeSubarraySum;

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

	private void assertMinSize(int expected, int[] nums, int s) {
		int actual = solution.minSubArrayLen(s, nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int s = 7;
		int expected = 2;
		assertMinSize(expected, nums, s);
	}

}
