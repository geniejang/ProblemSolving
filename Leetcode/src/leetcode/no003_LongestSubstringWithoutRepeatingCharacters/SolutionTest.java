package leetcode.no003_LongestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertResult(int expected, String s) {
		int actual = solution.lengthOfLongestSubstring(s);
		assertEquals(expected, actual);
	}

	@Test
	public void twoLongestSubstrings() {
		String s = "abcabcbb";
		int expected = 3;
		assertResult(expected, s);
	}

	@Test
	public void singleCharRepeated() {
		String s = "bbbbb";
		int expected = 1;
		assertResult(expected, s);
	}

	@Test
	public void wContinued() {
		String s = "pwwkew";
		int expected = 3;
		assertResult(expected, s);
	}

}
