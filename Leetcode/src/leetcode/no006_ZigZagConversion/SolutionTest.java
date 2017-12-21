package leetcode.no006_ZigZagConversion;

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
	public void convertSingleChar() {
		String actual = solution.convert("A", 1);
		String expected = "A";
		assertTrue(expected.equals(actual));
	}

	@Test
	public void convertExample() {
		String actual = solution.convert("PAYPALISHIRING", 3);
		String expected = "PAHNAPLSIIGYIR";
		assertTrue(expected.equals(actual));
	}

}
