package leetcode.no456_132Pattern;

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
	public void caseFalse() {
		int[] nums = { 1, 2, 3, 4 };
		assertFalse(solution.find132pattern(nums));
	}

	@Test
	public void caseTrue1() {
		int[] nums = { 3, 1, 4, 2 };
		assertTrue(solution.find132pattern(nums));
	}

	@Test
	public void caseTrue2() {
		int[] nums = { -1, 3, 2, 0 };
		assertTrue(solution.find132pattern(nums));
	}

}
