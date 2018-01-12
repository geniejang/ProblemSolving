package leetcode.no747_LargestNumberAtLeastTwoOfOthers;

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

	@Test
	public void twice() {
		int[] nums = { 3, 6, 1, 0 };
		int expected = 1;
		int actual = solution.dominantIndex(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void ascent() {
		int[] nums = { 1, 2, 3, 4 };
		int expected = -1;
		int actual = solution.dominantIndex(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void descent() {
		int[] nums = { 4, 3, 2, 1 };
		int expected = -1;
		int actual = solution.dominantIndex(nums);
		assertEquals(expected, actual);
	}

}
