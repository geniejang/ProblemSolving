package leetcode.no139_WordBreak;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	SolutionWithTrie solution;

	@Before
	public void init() {
		solution = new SolutionWithTrie();
	}

	private void assertWords(boolean expected, String s, List<String> wordDict) {
		boolean actual = solution.wordBreak(s, wordDict);
		assertEquals(expected, actual);
	}

	@Test
	public void leetcode() {
		String s = "leetcode";
		List<String> wordDict = Arrays.asList("leet", "code");
		boolean expected = true;
		assertWords(expected, s, wordDict);
	}

	@Test
	public void incomplete() {
		String s = "leetcode";
		List<String> wordDict = Arrays.asList("leet", "codee");
		boolean expected = false;
		assertWords(expected, s, wordDict);
	}

	@Test
	public void emptyString() {
		String s = "";
		List<String> wordDict = Arrays.asList("leet", "codee");
		boolean expected = true;
		assertWords(expected, s, wordDict);
	}

	@Test(timeout = 100)
	public void longString() {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		List<String> wordDict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa",
				"aaaaaaaaa", "aaaaaaaaaa");
		boolean expected = false;
		assertWords(expected, s, wordDict);
	}

}
