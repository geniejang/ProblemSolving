package leetcode.no179_LargestNumber;

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

	private void assertLargest(String expected, int[] nums) {
		String actual = solution.largestNumber(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] nums = { 10, 2 };
		String expected = "210";
		assertLargest(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 3, 30, 34, 5, 9 };
		String expected = "9534330";
		assertLargest(expected, nums);
	}

	@Test
	public void longerAndSmallerFirst() {
		int[] nums = { 121, 12 };
		String expected = "12121";
		assertLargest(expected, nums);
	}

	@Test
	public void longerAndBiggerFirst() {
		int[] nums = { 1213, 12 };
		String expected = "121312";
		assertLargest(expected, nums);
	}

	@Test
	public void longerAndSmallerFollowing() {
		int[] nums = { 12, 121 };
		String expected = "12121";
		assertLargest(expected, nums);
	}

	@Test
	public void longerAndBiggerFollowing() {
		int[] nums = { 12, 123 };
		String expected = "12312";
		assertLargest(expected, nums);
	}

	@Test
	public void sameLengthSmallerFirst() {
		int[] nums = { 12, 13 };
		String expected = "1312";
		assertLargest(expected, nums);
	}

	@Test
	public void sameLengthBiggerFirst() {
		int[] nums = { 13, 12 };
		String expected = "1312";
		assertLargest(expected, nums);
	}

	@Test
	public void sameNumbers() {
		int[] nums = { 1, 1, 1 };
		String expected = "111";
		assertLargest(expected, nums);
	}

	@Test
	public void zeroesOnly() {
		int[] nums = { 0, 0 };
		String expected = "0";
		assertLargest(expected, nums);
	}

}
