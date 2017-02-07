package leetcode.no459_RepeatedSubstringPattern;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertString(boolean expected, String str) {
		boolean actual = solution.repeatedSubstringPattern(str);
		assertEquals(expected, actual);
	}

	@Test
	public void abab() {
		assertString(true, "abab");
	}

	@Test
	public void aba() {
		assertString(false, "aba");
	}

	@Test
	public void abcabcabcabc() {
		assertString(true, "abcabcabcabc");
	}

}
