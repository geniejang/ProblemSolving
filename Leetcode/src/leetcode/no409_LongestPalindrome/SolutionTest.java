package leetcode.no409_LongestPalindrome;

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

	private void assertLength(int expected, String s) {
		int actual = solution.longestPalindrome(s);
		assertEquals(expected, actual);
	}

	@Test
	public void caseSensitive() {
		String s = "Aa";
		int expected = 1;
		assertLength(expected, s);
	}

	@Test
	public void abccccdd() {
		String s = "abccccdd";
		int expected = 7;
		assertLength(expected, s);
	}

}
