package leetcode.no016_3SumClosest;

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

	private void assertThreeSumClosest(int expected, int target, int[] nums) {
		int actual = solution.threeSumClosest(nums, target);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int expected = 2;
		assertThreeSumClosest(expected, target, nums);
	}

	@Test
	public void zeroOneTwo() {
		int[] nums = { 0, 1, 2 };
		int target = 3;
		int expected = 3;
		assertThreeSumClosest(expected, target, nums);
	}

	@Test
	public void onePositive() {
		int[] nums = { -3, -2, -5, 3, -4 };
		int target = -1;
		int expected = -2;
		assertThreeSumClosest(expected, target, nums);
	}

	@Test
	public void oneNegative() {
		int[] nums = { 0, 2, 1, -3 };
		int target = 1;
		int expected = 0;
		assertThreeSumClosest(expected, target, nums);
	}

	@Test
	public void oneAll() {
		int[] nums = { 1, 1, 1, 1 };
		int target = 0;
		int expected = 3;
		assertThreeSumClosest(expected, target, nums);
	}

}
