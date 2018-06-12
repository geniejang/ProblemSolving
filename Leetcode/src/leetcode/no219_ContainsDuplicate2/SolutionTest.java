package leetcode.no219_ContainsDuplicate2;

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

	private void assertDuplicate(boolean expected, int[] nums, int k) {
		boolean actual = solution.containsNearbyDuplicate(nums, k);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		boolean expected = true;
		assertDuplicate(expected, nums, k);
	}

	@Test
	public void example2() {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;
		boolean expected = true;
		assertDuplicate(expected, nums, k);
	}

	@Test
	public void example3() {
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		boolean expected = false;
		assertDuplicate(expected, nums, k);
	}

}
