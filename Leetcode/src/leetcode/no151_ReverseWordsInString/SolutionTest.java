package leetcode.no151_ReverseWordsInString;

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

	private void assertReversed(String expected, String s) {
		String actual = solution.reverseWords(s);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		String s = "the sky is blue";
		String expected = "blue is sky the";
		assertReversed(expected, s);
	}

	@Test
	public void emptyString() {
		String s = "";
		String expected = "";
		assertReversed(expected, s);
	}

	@Test
	public void spacesOnly() {
		String s = "    ";
		String expected = "";
		assertReversed(expected, s);
	}

	@Test
	public void singleWord() {
		String s = "hello";
		String expected = "hello";
		assertReversed(expected, s);
	}

	@Test
	public void leadingSpaces() {
		String s = "      the sky is blue";
		String expected = "blue is sky the";
		assertReversed(expected, s);
	}

	@Test
	public void trailingSpaces() {
		String s = "the sky is blue   ";
		String expected = "blue is sky the";
		assertReversed(expected, s);
	}

	@Test
	public void multipleSpacesBetweenWords() {
		String s = "the sky       is blue";
		String expected = "blue is sky the";
		assertReversed(expected, s);
	}

}
