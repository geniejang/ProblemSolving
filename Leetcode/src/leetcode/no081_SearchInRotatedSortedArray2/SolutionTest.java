package leetcode.no081_SearchInRotatedSortedArray2;

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

	private void assertSearch(boolean expected, int[] nums, int target) {
		boolean actual = solution.search(nums, target);
		assertEquals(expected, actual);
	}

	@Test
	public void duplicatedMax() {
		int[] nums = { 2, 2, 2, 2, 1, 2, 2 };
		int target = 1;
		boolean expected = true;
		assertSearch(expected, nums, target);
	}

	@Test
	public void duplicatedMin() {
		int[] nums = { 2, 2, 5, 2, 2, 2, 2 };
		int target = 5;
		boolean expected = true;
		assertSearch(expected, nums, target);
	}

}
