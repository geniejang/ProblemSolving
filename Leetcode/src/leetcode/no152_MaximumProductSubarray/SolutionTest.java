package leetcode.no152_MaximumProductSubarray;

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

	private void assertProduct(int expected, int[] nums) {
		int actual = solution.maxProduct(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void singleNegativeBetweenPositives() {
		int[] nums = { 2, 3, -2, 4 };
		int expected = 6;
		assertProduct(expected, nums);
	}

	@Test
	public void singleBiggestNegativeBetweenPositives() {
		int[] nums = { 2, 3, -20, 4 };
		int expected = 6;
		assertProduct(expected, nums);
	}

	@Test
	public void singleNegativeOnly() {
		int[] nums = { -7 };
		int expected = -7;
		assertProduct(expected, nums);
	}

	@Test
	public void evenNegatives() {
		int[] nums = { 2, -1, 3, -2, 4 };
		int expected = 48;
		assertProduct(expected, nums);
	}

	@Test
	public void oddNegatives() {
		int[] nums = { 2, -1, 3, -7, 4, 3, 2, -2, 4 };
		int expected = 4032;
		assertProduct(expected, nums);
	}

	@Test
	public void negativesOnly() {
		int[] nums = { -4, -3, -2 };
		int expected = 12;
		assertProduct(expected, nums);
	}

	@Test
	public void negativesWithZero() {
		int[] nums = { -1, -2, -3, 0 };
		int expected = 6;
		assertProduct(expected, nums);
	}

}
