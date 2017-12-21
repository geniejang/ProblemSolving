package leetcode.no041_FirstMissingPositive;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertFirst(int expected, int[] nums) {
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void last() {
		int[] nums = { 1, 2, 0 };
		int expected = 3;
		assertFirst(expected, nums);
	}

	@Test
	public void full() {
		int[] nums = { 1, 2, 3 };
		int expected = 4;
		assertFirst(expected, nums);
	}

	@Test
	public void mid() {
		int[] nums = { 3, 4, -1, 1 };
		int expected = 2;
		assertFirst(expected, nums);
	}
}
