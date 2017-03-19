package leetcode.no415_AddStrings;

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

	private void assertAdded(String expected, String num1, String num2) {
		String actual = solution.addStrings(num1, num2);
		assertEquals(expected, actual);
	}

	@Test
	public void bothZeroes() {
		String num1 = "0";
		String num2 = "0";
		String expected = "0";
		assertAdded(expected, num1, num2);
	}

	@Test
	public void noCarries() {
		String num1 = "4";
		String num2 = "5";
		String expected = "9";
		assertAdded(expected, num1, num2);
	}

	@Test
	public void carriesButNotLengthened() {
		String num1 = "37";
		String num2 = "26";
		String expected = "63";
		assertAdded(expected, num1, num2);
	}

	@Test
	public void lengthenedByCarry() {
		String num1 = "55";
		String num2 = "55";
		String expected = "110";
		assertAdded(expected, num1, num2);
	}

	@Test
	public void differentLengths() {
		String num1 = "111234";
		String num2 = "55";
		String expected = "111289";
		assertAdded(expected, num1, num2);
	}

}
