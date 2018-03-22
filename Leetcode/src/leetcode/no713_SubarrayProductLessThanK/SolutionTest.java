package leetcode.no713_SubarrayProductLessThanK;

import static org.junit.Assert.*;

import java.util.Arrays;

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

	private void assertSubrrays(int expected, int[] nums, int k) {
		int actual = solution.numSubarrayProductLessThanK(nums, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		int expected = 8;
		assertSubrrays(expected, nums, k);
	}

	@Test
	public void overFirst() {
		int[] nums = { 99, 5, 7, 8 };
		int k = 90;
		int expected = 5;
		assertSubrrays(expected, nums, k);
	}

	@Test
	public void allOne() {
		int[] nums = new int[50000];
		Arrays.fill(nums, 1);
		int k = 9;
		int expected = 1250025000;
		assertSubrrays(expected, nums, k);
	}

}
