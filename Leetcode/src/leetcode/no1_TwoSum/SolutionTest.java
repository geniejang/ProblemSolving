package leetcode.no1_TwoSum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Solution solution;

	@Before
	public void initantiate() {
		solution = new Solution();
	}

	@Test
	public void target9() {
		int[] nums = { 2, 7, 11, 9 };
		int target = 9;
		int[] expecteds = { 0, 1 };

		int[] actuals = solution.twoSum(nums, target);
		assertArrayEquals(expecteds, actuals);
	}

}
