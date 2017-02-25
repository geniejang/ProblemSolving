package leetcode.no14_LongestCommonPrefix;

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

	private void assertPrefix(String expected, String[] strs) {
		String actual = solution.longestCommonPrefix(strs);
		assertTrue(expected.equals(actual));
	}

	@Test
	public void emptyStrings() {
		String[] strs = {};
		String expected = "";
		assertPrefix(expected, strs);
	}

	@Test
	public void twoLetters() {
		String[] strs = { "abcd", "abc", "abdd", "abbbbbbbbbbb" };
		String expected = "ab";
		assertPrefix(expected, strs);
	}

}
