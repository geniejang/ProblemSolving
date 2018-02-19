package leetcode.no647_PalindromicSubstrings;

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

	private void assertPaindromicSubstrings(int expected, String s) {
		int actual = solution.countSubstrings(s);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String s = "abc";
		int expected = 3;
		assertPaindromicSubstrings(expected, s);
	}

	@Test
	public void example2() {
		String s = "aaa";
		int expected = 6;
		int actual = solution.countSubstrings(s);
		assertEquals(expected, actual);
		assertPaindromicSubstrings(expected, s);
	}

}
