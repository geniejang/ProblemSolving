package leetcode.no423_ReconstructOriginalDigitsFromEnglish;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertDigits(String expected, String s) {
		String actual = solution.originalDigits(s);
		assertEquals(expected, actual);
	}

	@Test
	public void zerOneTwo() {
		String s = "owoztneoer";
		String expected = "012";
		assertDigits(expected, s);
	}

	@Test
	public void fourFive() {
		String s = "fviefuro";
		String expected = "45";
		assertDigits(expected, s);
	}

	@Test
	public void six() {
		String s = "xsi";
		String expected = "6";
		assertDigits(expected, s);
	}

	@Test
	public void multipleOnesAndTwoes() {
		String s = "tonetwotowoonew";
		String expected = "11222";
		assertDigits(expected, s);
	}

}
