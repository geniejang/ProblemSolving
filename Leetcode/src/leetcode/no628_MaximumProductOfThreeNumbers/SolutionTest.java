package leetcode.no628_MaximumProductOfThreeNumbers;

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

	private void assertProduct(int[] nums, int expected) {
		int actual = solution.maximumProduct2(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void threeNumbers() {
		int[] nums = { 1, 2, 3 };
		int expected = 6;
		assertProduct(nums, expected);
	}

	@Test
	public void moreThanThreePositives() {
		int[] nums = { 1, 2, 3, 4 };
		int expected = 24;
		assertProduct(nums, expected);
	}

	@Test
	public void oneNegative() {
		int[] nums = { 1, 2, -3, 4 };
		int expected = 8;
		assertProduct(nums, expected);
	}

	@Test
	public void twoNegatives() {
		int[] nums = { 1, 2, -3, -4 };
		int expected = 24;
		assertProduct(nums, expected);
	}

	@Test
	public void onlyNegatives() {
		int[] nums = { -1, -2, -3, -4 };
		int expected = -6;
		assertProduct(nums, expected);
	}

}
