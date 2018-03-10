package leetcode.no162_FindPeakElement;

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

	private void assertPeak(int expected, int[] nums) {
		int actual = solution.findPeakElementBS(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void singleElement() {
		int[] nums = { 1 };
		int expected = 0;
		assertPeak(expected, nums);
	}

	@Test
	public void ascendingOrder() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int expected = 4;
		assertPeak(expected, nums);
	}

	@Test
	public void decendingOrder() {
		int[] nums = { 5, 4, 3, 2, 1 };
		int expected = 0;
		assertPeak(expected, nums);
	}

	@Test
	public void innerPeakInLeftHalfIn5() {
		int[] nums = { 3, 4, 3, 2, 1 };
		int expected = 1;
		assertPeak(expected, nums);
	}

	@Test
	public void innerPeakInRightHalfIn5() {
		int[] nums = { 1, 2, 3, 7, 1 };
		int expected = 3;
		assertPeak(expected, nums);
	}

	@Test
	public void innerPeakInLeftHalfIn4() {
		int[] nums = { 3, 4, 3, 2 };
		int expected = 1;
		assertPeak(expected, nums);
	}

	@Test
	public void innerPeakInRightHalfIn4() {
		int[] nums = { 1, 2, 3, 1 };
		int expected = 2;
		assertPeak(expected, nums);
	}

}
