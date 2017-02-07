package leetcode.no66_PlusOne;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertPlusOne(int[] expecteds, int[] digits) {
		int[] actuals = solution.plusOne(digits);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void singleDigitWithoutCarry() {
		int[] digits = { 3 };
		int[] expecteds = { 4 };
		assertPlusOne(expecteds, digits);
	}

	@Test
	public void multipleDigitsWithoutCarry() {
		int[] digits = { 3, 8 };
		int[] expecteds = { 3, 9 };
		assertPlusOne(expecteds, digits);
	}

	@Test
	public void singleDigitWithCarry() {
		int[] digits = { 9 };
		int[] expecteds = { 1, 0 };
		assertPlusOne(expecteds, digits);
	}

	@Test
	public void multipleDigitsWithCarry() {
		int[] digits = { 4, 6, 9, 9 };
		int[] expecteds = { 4, 7, 0, 0 };
		assertPlusOne(expecteds, digits);
	}

	@Test
	public void allNine() {
		int[] digits = { 9, 9, 9, 9 };
		int[] expecteds = { 1, 0, 0, 0, 0 };
		assertPlusOne(expecteds, digits);
	}
}
