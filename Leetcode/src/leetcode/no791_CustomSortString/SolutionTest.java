package leetcode.no791_CustomSortString;

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

	private void assertCustrom(String expected, String S, String T) {
		String actual = solution.customSortString(S, T);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		String S = "cba";
		String T = "abcd";
		String expected = "cbad";
		assertCustrom(expected, S, T);
	}

}
