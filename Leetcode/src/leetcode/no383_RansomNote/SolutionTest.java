package leetcode.no383_RansomNote;

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

	@Test
	public void noMatch() {
		String ransomNote = "a";
		String magazine = "b";
		boolean expected = false;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		assertEquals(expected, actual);
	}

	@Test
	public void partialMatch() {
		String ransomNote = "aa";
		String magazine = "ab";
		boolean expected = false;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		assertEquals(expected, actual);
	}

	@Test
	public void fullMatch() {
		String ransomNote = "aa";
		String magazine = "aab";
		boolean expected = true;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		assertEquals(expected, actual);
	}

}
