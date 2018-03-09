package leetcode.no153_FindMinimumInRotatedSortedArray;

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

	private void assertMin(int expected, int[] nums) {
		int actual = solution.findMin(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void noRotation() {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int expected = 0;
		assertMin(expected, nums);
	}

	@Test
	public void rotate1() {
		int[] nums = { 8, 1, 2, 3, 4, 5, 6, 7 };
		int expected = 1;
		assertMin(expected, nums);
	}

	@Test
	public void rotate2() {
		int[] nums = { 8, 9, 2, 3, 4, 5, 6, 7 };
		int expected = 2;
		assertMin(expected, nums);
	}

	@Test
	public void rotate3() {
		int[] nums = { 8, 9, 10, 3, 4, 5, 6, 7 };
		int expected = 3;
		assertMin(expected, nums);
	}

	@Test
	public void rotate4() {
		int[] nums = { 8, 9, 10, 11, 4, 5, 6, 7 };
		int expected = 4;
		assertMin(expected, nums);
	}

	@Test
	public void rotate5() {
		int[] nums = { 8, 9, 10, 11, 12, 5, 6, 7 };
		int expected = 5;
		assertMin(expected, nums);
	}

	@Test
	public void rotate6() {
		int[] nums = { 8, 9, 10, 11, 12, 13, 6, 7 };
		int expected = 6;
		assertMin(expected, nums);
	}

	@Test
	public void rotate7() {
		int[] nums = { 8, 9, 10, 11, 12, 13, 14, 7 };
		int expected = 7;
		assertMin(expected, nums);
	}

}
