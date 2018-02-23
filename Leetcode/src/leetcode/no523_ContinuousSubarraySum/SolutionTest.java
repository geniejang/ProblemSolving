package leetcode.no523_ContinuousSubarraySum;

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

	private void assertCheck(boolean expected, int[] nums, int k) {
		boolean actual = solution.checkSubarraySum2(nums, k);
		assertEquals(expected, actual);
	}

	@Test
	public void emptyArray() {
		int[] nums = {};
		int k = 6;
		boolean expected = false;
		assertCheck(expected, nums, k);
	}

	@Test
	public void example1() {
		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 6;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

	@Test
	public void example2() {
		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 42;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

	@Test
	public void lessTotalToK() {
		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 77;
		boolean expected = false;
		assertCheck(expected, nums, k);
	}

	@Test
	public void test() {
		int[] nums = { 2, 4, 6, 8, 11 };
		int k = 9;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

	@Test
	public void kNegative() {
		int[] nums = { 2, 2, 2 };
		int k = -1;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

	@Test
	public void kZero() {
		int[] nums = { 0, 0 };
		int k = 0;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

	@Test
	public void threeSumsUpToK() {
		int[] nums = { 1, 7, 7, 8 };
		int k = 11;
		boolean expected = true;
		assertCheck(expected, nums, k);
	}

}
