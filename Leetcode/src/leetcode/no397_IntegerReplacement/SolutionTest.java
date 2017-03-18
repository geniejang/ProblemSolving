package leetcode.no397_IntegerReplacement;

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
	public void eight() {
		int n = 8;
		int expected = 3;
		int actual = solution.integerReplacement(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void seven() {
		int n = 7;
		int expected = 4;
		int actual = solution.integerReplacement(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void int_max() {
		int n = 2147483647;
		int expected = 32;
		int actual = solution.integerReplacement(n);
		assertEquals(expected, actual);
	}

}
