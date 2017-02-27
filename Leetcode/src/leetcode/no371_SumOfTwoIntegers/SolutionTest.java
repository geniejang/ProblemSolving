package leetcode.no371_SumOfTwoIntegers;

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
	public void noCarry() {
		int a = 1;
		int b = 2;
		int expected = 3;
		int actual = solution.getSum(a, b);
		assertEquals(expected, actual);
	}
	
	@Test
	public void singleCarry() {
		int a = 1;
		int b = 1;
		int expected = 2;
		int actual = solution.getSum(a, b);
		assertEquals(expected, actual);
	}

}
