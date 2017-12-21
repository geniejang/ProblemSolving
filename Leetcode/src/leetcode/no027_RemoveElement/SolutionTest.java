package leetcode.no027_RemoveElement;

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

	@Test
	public void test() {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int expected = 2;
		int actual = solution.removeElement(nums, val);
		assertEquals(expected, actual);
		int[] expecteds = { 2, 2 };
		for (int i = 0; i < expected; i++) {
			assertEquals(expecteds[i], nums[i]);
		}
	}

}
