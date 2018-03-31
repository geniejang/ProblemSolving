package leetcode.no045_JumpGame2;

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

	private void assertJumps(int expected, int[] nums) {
		int actual = solution.jump(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void singleNumber() {
		int[] nums = { 0 };
		int expected = 0;
		assertJumps(expected, nums);
	}

	@Test
	public void example() {
		int[] nums = { 2, 3, 1, 1, 4 };
		int expected = 2;
		assertJumps(expected, nums);
	}

	@Test
	public void overEnd() {
		int[] nums = { 7, 1, 3, 1, 4 };
		int expected = 1;
		assertJumps(expected, nums);
	}

}
