package leetcode.no217_ContainsDuplicate;

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

	private void assertDuplicate(boolean expected, int[] nums) {
		boolean actual = solution.containsDuplicate(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] nums = { 1, 2, 3, 1 };
		boolean expected = true;
		assertDuplicate(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 1, 2, 3, 4 };
		boolean expected = false;
		assertDuplicate(expected, nums);
	}

	@Test
	public void example3() {
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		boolean expected = true;
		assertDuplicate(expected, nums);
	}

}
