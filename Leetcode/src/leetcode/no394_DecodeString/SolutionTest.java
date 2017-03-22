package leetcode.no394_DecodeString;

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

	private void assertString(String expected, String s) {
		String actual = solution.decodeString(s);
		assertEquals(expected, actual);
	}

	@Test
	public void aaabcbc() {
		String s = "3[a]2[bc]";
		String expected = "aaabcbc";
		assertString(expected, s);
	}

	@Test
	public void accaccacc() {
		String s = "3[a2[c]]";
		String expected = "accaccacc";
		assertString(expected, s);
	}

	@Test
	public void abcabccdcdcdef() {
		String s = "2[abc]3[cd]ef";
		String expected = "abcabccdcdcdef";
		assertString(expected, s);
	}

}
