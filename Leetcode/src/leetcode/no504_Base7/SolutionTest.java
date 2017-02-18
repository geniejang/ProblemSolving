package leetcode.no504_Base7;

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

	private void assertConverting(String expected, int num) {
		String actual = solution.convertToBase7(num);
		assertTrue(expected.equals(actual));
	}

	@Test
	public void singleDigit() {
		assertConverting("0", 0);
		assertConverting("1", 1);
		assertConverting("2", 2);
		assertConverting("3", 3);
		assertConverting("4", 4);
		assertConverting("5", 5);
		assertConverting("6", 6);
	}

	@Test
	public void twoDigits() {
		assertConverting("10", 7);
	}

	@Test
	public void threeDigits() {
		assertConverting("202", 100);
	}

	@Test
	public void minus() {
		assertConverting("-10", -7);
	}

}
