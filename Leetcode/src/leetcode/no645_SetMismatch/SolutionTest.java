package leetcode.no645_SetMismatch;

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

	private void assertErrorNums(int[] expecteds, int[] nums) {
		int[] actuals = solution.findErrorNums(nums);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void double2WithMissed3() {
		int[] nums = { 1, 2, 2, 4 };
		int[] expecteds = { 2, 3 };
		assertErrorNums(expecteds, nums);
	}

	@Test
	public void double2WithMissed1() {
		int[] nums = { 2, 2 };
		int[] expecteds = { 2, 1 };
		assertErrorNums(expecteds, nums);
	}

	@Test
	public void double1WithMissed2() {
		int[] nums = { 1, 1 };
		int[] expecteds = { 1, 2 };
		assertErrorNums(expecteds, nums);
	}

}
