package leetcode.no485_MaxConsecutiveOnes;

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
	public void test() {
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int expected = 3;
		int actual = solution.findMaxConsecutiveOnes(nums);
		assertEquals(expected, actual);
	}

}
