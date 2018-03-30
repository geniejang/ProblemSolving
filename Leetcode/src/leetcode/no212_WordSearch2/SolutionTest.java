package leetcode.no212_WordSearch2;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

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

	private void assertFounds(List<String> expected, char[][] board, String[] words) {
		List<String> actual = solution.findWords(board, words);
		assertThat(actual, containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void example() {
		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain" };
		List<String> expected = List.of("eat", "oath");
		assertFounds(expected, board, words);
	}

	@Test
	public void visited() {
		char[][] board = { { 'a', 'a' } };
		String[] words = { "aaa" };
		List<String> expected = List.of();
		assertFounds(expected, board, words);
	}

	@Test
	public void sameWords() {
		char[][] board = { { 'a', 'a' } };
		String[] words = { "a" };
		List<String> expected = List.of("a");
		assertFounds(expected, board, words);
	}

}
