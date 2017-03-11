package leetcode.no389_FindTheDifference;

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

	private void assertDifference(char expected, String s, String t) {
		char actual = solution.findTheDifference(s, t);
		assertEquals(expected, actual);
	}

	@Test
	public void newChar() {
		String s = "abcd";
		String t = "abcde";
		char expected = 'e';
		assertDifference(expected, s, t);
	}

	@Test
	public void existingChar() {
		String s = "abcde";
		String t = "abccde";
		char expected = 'c';
		assertDifference(expected, s, t);
	}

	@Test
	public void oneChar() {
		String s = "";
		String t = "y";
		char expected = 'y';
		assertDifference(expected, s, t);
	}

}
