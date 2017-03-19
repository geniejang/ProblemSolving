package leetcode.no416_PartitionEqualSubsetSum;

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

	private void assertPartition(boolean expected, int[] nums) {
		boolean actual = solution.canPartition(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void halfBiggest() {
		int[] nums = { 1, 5, 11, 5 };
		boolean expected = true;
		assertPartition(expected, nums);
	}

	@Test
	public void overHalf() {
		int[] nums = { 1, 5, 13, 5 };
		boolean expected = false;
		assertPartition(expected, nums);
	}

	@Test
	public void oddSum() {
		int[] nums = { 1, 2, 3, 5 };
		boolean expected = false;
		assertPartition(expected, nums);
	}

	@Test
	public void twoVsThree() {
		int[] nums = { 1, 3, 4, 5, 1 };
		boolean expected = true;
		assertPartition(expected, nums);
	}

}
