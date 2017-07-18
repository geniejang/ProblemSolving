package leetcode.no643_MaximumAverageSubarray1;

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

	private void assertAverage(double expected, int[] nums, int k) {
		double actual = solution.findMaxAverage(nums, k);
		assertEquals(expected, actual, 1e-8);
	}

	@Test
	public void test() {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double expected = 12.75;
		assertAverage(expected, nums, k);
	}

}
