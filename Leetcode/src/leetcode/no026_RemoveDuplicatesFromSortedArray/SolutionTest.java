package leetcode.no026_RemoveDuplicatesFromSortedArray;

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

	private void assertDuplicateRemoved(int[] expecteds, int[] nums) {
		int actual = solution.removeDuplicates(nums);
		assertEquals(expecteds.length, actual);
		for (int i = 0; i < actual; i++) {
			assertEquals(expecteds[i], nums[i]);
		}
	}

	@Test
	public void example1() {
		int[] nums = { 1, 1, 2 };
		int[] expecteds = { 1, 2 };
		assertDuplicateRemoved(expecteds, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expecteds = { 0, 1, 2, 3, 4 };
		assertDuplicateRemoved(expecteds, nums);
	}

}
