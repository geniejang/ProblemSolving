package leetcode.no720_LongestWordInDictionary;

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

	private void assertLongestWord(String[] words, String expected) {
		String actual = solution.longestWord(words);
		assertEquals(expected, actual);
	}

	@Test
	public void world() {
		String[] words = { "w", "wo", "wor", "worl", "world" };
		String expected = "world";
		assertLongestWord(words, expected);
	}

	@Test
	public void appleAgainstBanana() {
		String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
		String expected = "apple";
		assertLongestWord(words, expected);
	}

}
