package leetcode.no581_ShortestUnsortedContinuousSubarray;

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

	private void assertUnsortedLength(int expected, int[] nums) {
		int actual = solution.findUnsortedSubarray2(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void sorted() {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int expected = 0;
		assertUnsortedLength(expected, nums);
	}

	@Test
	public void descented() {
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int expected = 9;
		assertUnsortedLength(expected, nums);
	}

	@Test
	public void partial() {
		int[] nums = { 2, 6, 4, 8, 10, 9, 15 };
		int expected = 5;
		assertUnsortedLength(expected, nums);
	}

	@Test
	public void duplicatedNumbers() {
		int[] nums = { 2, 1, 1, 1, 1 };
		int expected = 5;
		assertUnsortedLength(expected, nums);
	}

	@Test
	public void duplicatedValues() {
		int[] nums = { 2, 2, 2, 2, 1 };
		int expected = 5;
		assertUnsortedLength(expected, nums);
	}

	@Test
	public void unsortedBiggest() {
		int[] nums = { 1, 3, 2, 3, 3 };
		int expected = 2;
		assertUnsortedLength(expected, nums);
	}

}
