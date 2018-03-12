package leetcode.no127_WordLadder;

import static org.junit.Assert.*;

import java.util.List;

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

	private void assertLadderLength(int expected, String beginWord, String endWord, List<String> wordList) {
		int actual = solution.ladderLength(beginWord, endWord, wordList);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
		int expected = 5;
		assertLadderLength(expected, beginWord, endWord, wordList);
	}

}
