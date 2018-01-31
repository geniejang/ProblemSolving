package leetcode.no215_KthLargestElementInArray;

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

	private void assertKth(int expected, int[] nums, int k) {
		int actual = solution.findKthLargest(nums, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		int expected = 5;
		assertKth(expected, nums, k);
	}

}
