package leetcode.no516_LongestPalindromicSubsequence;

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

	private void assertLongestSubsequence(int expected, String s) {
		int actual = solution.longestPalindromeSubseq(s);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String s = "bbbab";
		int expected = 4;
		assertLongestSubsequence(expected, s);
	}

	@Test
	public void example2() {
		String s = "cbbd";
		int expected = 2;
		assertLongestSubsequence(expected, s);
	}

	@Test
	public void nullString() {
		String s = null;
		int expected = 0;
		assertLongestSubsequence(expected, s);
	}

	@Test
	public void emptyString() {
		String s = "";
		int expected = 0;
		assertLongestSubsequence(expected, s);
	}

	@Test
	public void singleChar() {
		String s = "a";
		int expected = 1;
		assertLongestSubsequence(expected, s);
	}

}
