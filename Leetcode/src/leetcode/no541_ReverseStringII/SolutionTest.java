package leetcode.no541_ReverseStringII;

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
	public void shorterThan1k() {
		String s = "a";
		int k = 2;
		String expected = "a";
		String actual = solution.reverseStr(s, k);
		assertEquals(expected, actual);
	}

	@Test
	public void endsAt1k() {
		String s = "abcdef";
		int k = 2;
		String expected = "bacdfe";
		String actual = solution.reverseStr(s, k);
		assertEquals(expected, actual);
	}

	@Test
	public void endsAt1kPlus1() {
		String s = "abcdefg";
		int k = 2;
		String expected = "bacdfeg";
		String actual = solution.reverseStr(s, k);
		assertEquals(expected, actual);
	}

	@Test
	public void endsAt2k() {
		String s = "abcdefgh";
		int k = 2;
		String expected = "bacdfegh";
		String actual = solution.reverseStr(s, k);
		assertEquals(expected, actual);
	}

}
