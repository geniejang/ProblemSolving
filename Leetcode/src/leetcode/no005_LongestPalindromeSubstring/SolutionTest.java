package leetcode.no005_LongestPalindromeSubstring;

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

	@Test
	public void babab() {
		String s = "babad";
		String expected = "bab";
		String actual = solution.longestPalindrome(s);
		assertEquals(expected, actual);
	}

	@Test
	public void cbbd() {
		String s = "cbbd";
		String expected = "bb";
		String actual = solution.longestPalindrome(s);
		assertEquals(expected, actual);
	}

	@Test(timeout = 10000)
	public void longString() {
		for (int i = 0; i < 100000; i++) {
			String s = "aaaaaaaaaaaaaaaaaasdfsdfaaaaaaaaaaaaaaaaaaaaaaodfonaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacc";
			String expected = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			String actual = solution.longestPalindrome(s);
			assertEquals(expected, actual);
		}
	}

}
