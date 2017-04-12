package leetcode.no132_PalindromePartitioning2;

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

	@Test
	public void aab() {
		String s = "aab";
		int expected = 1;
		int actual = solution.minCut(s);
		assertEquals(expected, actual);
	}

	@Test
	public void longerSecond() {
		String s = "aaabaa";
		int expected = 1;
		int actual = solution.minCut(s);
		assertEquals(expected, actual);
	}

}
