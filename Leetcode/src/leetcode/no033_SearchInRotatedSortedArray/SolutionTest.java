package leetcode.no033_SearchInRotatedSortedArray;

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

	private void assertIndex(int expected, int[] nums, int target) {
		int actual = solution.search(nums, target);
		assertEquals(expected, actual);
	}

	@Test
	public void singleElement() {
		int[] nums = { 4 };
		int target = 4;
		int expected = 0;
		assertIndex(expected, nums, target);
	}

	@Test
	public void lessThanSmallest() {
		int[] nums = { 4, 5, 6, 7, 2 };
		int target = 0;
		int expected = -1;
		assertIndex(expected, nums, target);
	}

	@Test
	public void greaterThanBiggest() {
		int[] nums = { 4, 5, 6, 7, 2 };
		int target = 8;
		int expected = -1;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate1() {
		int[] nums = { 7, 0, 1, 2, 3, 4, 5, 6 };
		int target = 4;
		int expected = 5;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate2() {
		int[] nums = { 6, 7, 0, 1, 2, 3, 4, 5 };
		int target = 4;
		int expected = 6;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate3() {
		int[] nums = { 5, 6, 7, 0, 1, 2, 3, 4 };
		int target = 4;
		int expected = 7;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate4() {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int target = 4;
		int expected = 0;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate5() {
		int[] nums = { 3, 4, 5, 6, 7, 0, 1, 2 };
		int target = 4;
		int expected = 1;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate6() {
		int[] nums = { 2, 3, 4, 5, 6, 7, 0, 1 };
		int target = 4;
		int expected = 2;
		assertIndex(expected, nums, target);
	}

	@Test
	public void rotate7() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 0 };
		int target = 4;
		int expected = 3;
		assertIndex(expected, nums, target);
	}

	@Test
	public void original() {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int target = 4;
		int expected = 4;
		assertIndex(expected, nums, target);
	}

}
