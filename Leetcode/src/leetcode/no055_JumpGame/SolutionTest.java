package leetcode.no055_JumpGame;

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

	@Test
	public void can() {
		int[] nums = { 2, 3, 1, 1, 4 };
		boolean expected = true;
		boolean actual = solution.canJump(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void cannot() {
		int[] nums = { 3, 2, 1, 0, 4 };
		boolean expected = false;
		boolean actual = solution.canJump(nums);
		assertEquals(expected, actual);
	}

}
