package leetcode.no300_LongestInscreasingSubsequence;

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
	public void example() {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int expected = 4;
		int actual = solution.lengthOfLIS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void emptyArray() {
		int[] nums = {};
		int expected = 0;
		int actual = solution.lengthOfLIS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void nullArray() {
		int[] nums = null;
		int expected = 0;
		int actual = solution.lengthOfLIS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void ascendingArray() {
		int[] nums = { 1, 3, 5, 6, 7, 9, 10, 11, 12 };
		int expected = 9;
		int actual = solution.lengthOfLIS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void descendingArray() {
		int[] nums = { 15, 13, 12, 11, 10, 9, 6, 5, 4, 2, 1 };
		int expected = 1;
		int actual = solution.lengthOfLIS(nums);
		assertEquals(expected, actual);
	}

}
