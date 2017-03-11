package leetcode.no532_KDiffPairsInAnArray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertPairs(int expected, int[] nums, int k) {
		int actual = solution.findPairs(nums, k);
		assertEquals(expected, actual);
	}

	@Test
	public void oneUniqueOneDuplicated() {
		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		int expected = 2;
		assertPairs(expected, nums, k);
	}

	@Test
	public void fiveUniques() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int k = 1;
		int expected = 4;
		assertPairs(expected, nums, k);
	}

	@Test
	public void singleUnique() {
		int[] nums = { 1, 3, 1, 5, 4 };
		int k = 0;
		int expected = 1;
		assertPairs(expected, nums, k);
	}

}
