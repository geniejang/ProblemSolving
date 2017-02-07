package leetcode.no283_MoveZeores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertMoveZeroes(int[] expecteds, int[] nums) {
		solution.moveZeroes(nums);
		assertArrayEquals(expecteds, nums);
	}

	@Test
	public void twoZeores() {
		int[] nums = { 0, 1, 0, 3, 12 };
		int[] expecteds = { 1, 3, 12, 0, 0 };
		assertMoveZeroes(expecteds, nums);
	}

	@Test
	public void noMoves() {
		int[] nums = { 1, 3, 12, 0, 0 };
		int[] expecteds = { 1, 3, 12, 0, 0 };
		assertMoveZeroes(expecteds, nums);
	}

	@Test
	public void noZeroes() {
		int[] nums = { 1, 12, 3 };
		int[] expecteds = { 1, 12, 3 };
		assertMoveZeroes(expecteds, nums);
	}

	@Test
	public void zeroesOnly() {
		int[] nums = { 0, 0, 0, 0, 0 };
		int[] expecteds = { 0, 0, 0, 0, 0 };
		assertMoveZeroes(expecteds, nums);
	}

}
