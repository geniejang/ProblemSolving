package leetcode.no633_SumOfSquareNumbers;

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
	public void five() {
		int num = 5;
		boolean expected = true;
		boolean actual = solution.judgeSquareSum(num);
		assertEquals(expected, actual);
	}

	@Test
	public void three() {
		int num = 3;
		boolean expected = false;
		boolean actual = solution.judgeSquareSum(num);
		assertEquals(expected, actual);
	}

}
