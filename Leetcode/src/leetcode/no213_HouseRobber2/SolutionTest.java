package leetcode.no213_HouseRobber2;

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

	private void assertMoney(int expected, int[] nums) {
		int actual = solution.rob(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] nums = { 2, 3, 2 };
		int expected = 3;
		assertMoney(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 1, 2, 3, 1 };
		int expected = 4;
		assertMoney(expected, nums);
	}

	@Test
	public void empty() {
		int[] nums = {};
		int expected = 0;
		assertMoney(expected, nums);
	}

	@Test
	public void single() {
		int[] nums = { 7 };
		int expected = 7;
		assertMoney(expected, nums);
	}

	@Test
	public void two() {
		int[] nums = { 7, 3 };
		int expected = 7;
		assertMoney(expected, nums);
	}

}
