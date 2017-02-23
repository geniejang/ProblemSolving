package leetcode.no525_ContiguousArray;

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

	private void assertMaxLength(int expected, int[] nums) {
		int actual = solution.findMaxLength(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void empty() {
		int[] nums = {};
		assertMaxLength(0, nums);
	}

	@Test
	public void oneEach() {
		int[] nums = { 0, 1 };
		assertMaxLength(2, nums);
	}

	@Test
	public void zeroOneZero() {
		int[] nums = { 0, 1, 0 };
		assertMaxLength(2, nums);
	}

	@Test
	public void complicated() {
		int[] nums = { 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1 };
		assertMaxLength(10, nums);
	}

}
