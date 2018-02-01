package leetcode.no034_SearchForRange;

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

	private void assertRange(int[] expecteds, int[] nums, int target) {
		int[] actuals = solution.searchRange(nums, target);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void example() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] expecteds = { 3, 4 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void singleTarget() {
		int[] nums = { 8 };
		int target = 8;
		int[] expecteds = { 0, 0 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void allTargets() {
		int[] nums = { 8, 8, 8, 8 };
		int target = 8;
		int[] expecteds = { 0, 3 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void allLeesers() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 8;
		int[] expecteds = { -1, -1 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void allGreaters() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 8;
		int[] expecteds = { -1, -1 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void targetsOnLeftSide() {
		int[] nums = { 8, 8, 8, 200 };
		int target = 8;
		int[] expecteds = { 0, 2 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void targetsOnRightSide() {
		int[] nums = { 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
		int target = 8;
		int[] expecteds = { 11, 12 };
		assertRange(expecteds, nums, target);
	}

	@Test
	public void noTarget() {
		int[] nums = { 1, 3, 5, 7, 9, 11 };
		int target = 8;
		int[] expecteds = { -1, -1 };
		assertRange(expecteds, nums, target);
	}

}
