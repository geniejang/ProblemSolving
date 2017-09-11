package leetcode.no376_WiggleSequence;

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

	private void assertWiggleLength(int expected, int[] nums) {
		int actual = solution.wiggleMaxLength(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void empty() {
		int[] nums = {};
		int expected = 0;
		assertWiggleLength(expected, nums);
	}

	@Test
	public void fullWiggle() {
		int[] nums = { 1, 7, 4, 9, 2, 5 };
		int expected = 6;
		assertWiggleLength(expected, nums);
	}

	@Test
	public void partialWiggle() {
		int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		int expected = 7;
		assertWiggleLength(expected, nums);
	}

	@Test
	public void noWiggle() {
		int[] nums = { 1, 1 };
		int expected = 1;
		assertWiggleLength(expected, nums);
	}

	@Test
	public void sameNumberSequence() {
		int[] nums = { 3, 3, 3, 2, 5 };
		int expected = 3;
		assertWiggleLength(expected, nums);
	}

}
