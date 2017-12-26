package leetcode.no682_BaseballGame;

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

	private void assertPoints(int expected, String[] ops) {
		int actual = solution.calPoints(ops);
		assertEquals(expected, actual);
	}

	@Test
	public void twoNumbers() {
		String[] ops = { "3", "4" };
		int expected = 7;
		assertPoints(expected, ops);
	}

	@Test
	public void C() {
		String[] ops = { "3", "C" };
		int expected = 0;
		assertPoints(expected, ops);
	}

	@Test
	public void D() {
		String[] ops = { "3", "D" };
		int expected = 9;
		assertPoints(expected, ops);
	}

	@Test
	public void plus() {
		String[] ops = { "3", "2", "+" };
		int expected = 10;
		assertPoints(expected, ops);
	}

	@Test
	public void given1() {
		String[] ops = { "5", "2", "C", "D", "+" };
		int expected = 30;
		assertPoints(expected, ops);
	}

	@Test
	public void given2() {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		int expected = 27;
		assertPoints(expected, ops);
	}

}
