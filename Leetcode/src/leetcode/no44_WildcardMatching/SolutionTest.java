package leetcode.no44_WildcardMatching;

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

	private void assertMatching(boolean expected, String s, String p) {
		boolean actual = solution.isMatch(s, p);
		assertEquals(expected, actual);
	}

	@Test
	public void partialGivesFalse() {
		String s = "aa";
		String p = "a";
		boolean expected = false;
		assertMatching(expected, s, p);
	}

	@Test
	public void sameGivesTrue() {
		String s = "aa";
		String p = "aa";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void singleAestariskGivesTrue() {
		String s = "aa";
		String p = "*";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void continuedAestarisk() {
		String s = "aaaa";
		String p = "***a";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void emptyVsAestarisk() {
		String s = "";
		String p = "*";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void complicated() {
		String s = "abefcdgiescdfimde";
		String p = "ab*cd?i*de";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void aestariskForNone() {
		String s = "abc";
		String p = "a*b*c";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

	@Test
	public void longString() {
		String s = "aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba";
		String p = "*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*";
		boolean expected = true;
		assertMatching(expected, s, p);
	}

}
