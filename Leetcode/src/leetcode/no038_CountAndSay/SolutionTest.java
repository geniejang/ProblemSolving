package leetcode.no038_CountAndSay;

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

	private void assertCountAndSay(String expected, int num) {
		String actual = solution.countAndSay(num);
		assertTrue(expected.equals(actual));
	}

	@Test
	public void first() {
		assertCountAndSay("11", 2);
	}

	@Test
	public void second() {
		assertCountAndSay("21", 3);
	}

	@Test
	public void third() {
		assertCountAndSay("1211", 4);
	}

	@Test
	public void fourth() {
		assertCountAndSay("111221", 5);
	}

}
