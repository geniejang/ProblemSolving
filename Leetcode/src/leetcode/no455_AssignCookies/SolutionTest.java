package leetcode.no455_AssignCookies;

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
	public void threeChildrenAndTwoCookies() {
		int[] g = { 1, 2, 3 };
		int[] s = { 1, 1 };
		int expected = 1;
		int actual = solution.findContentChildren(g, s);
		assertEquals(expected, actual);
	}

	@Test
	public void twoChildrenAndThreeCookies() {
		int[] g = { 1, 2 };
		int[] s = { 1, 2, 3 };
		int expected = 2;
		int actual = solution.findContentChildren(g, s);
		assertEquals(expected, actual);
	}
}
