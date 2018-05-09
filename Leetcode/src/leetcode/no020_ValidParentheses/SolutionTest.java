package leetcode.no020_ValidParentheses;

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

	private void assertValid(boolean expected, String s) {
		boolean actual = solution.isValid(s);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String s = "()";
		boolean expected = true;
		assertValid(expected, s);
	}

	@Test
	public void example2() {
		String s = "()[]{}";
		boolean expected = true;
		assertValid(expected, s);
	}

	@Test
	public void example3() {
		String s = "(]";
		boolean expected = false;
		assertValid(expected, s);
	}

	@Test
	public void example4() {
		String s = "([)]";
		boolean expected = false;
		assertValid(expected, s);
	}

	@Test
	public void example5() {
		String s = "{[]}";
		boolean expected = true;
		assertValid(expected, s);
	}

	@Test
	public void openingOnly() {
		String s = "(";
		boolean expected = false;
		assertValid(expected, s);
	}

	@Test
	public void closingOnly() {
		String s = "}";
		boolean expected = false;
		assertValid(expected, s);
	}

}
