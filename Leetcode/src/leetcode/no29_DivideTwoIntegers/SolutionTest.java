package leetcode.no29_DivideTwoIntegers;

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

	private void assertQuote(int expected, int dividend, int divisor) {
		int actual = solution.divide(dividend, divisor);
		assertEquals(expected, actual);
	}

	@Test
	public void divideByZero() {
		int dividend = 1;
		int divisor = 0;
		int expected = Integer.MAX_VALUE;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void zeroDivPos() {
		int dividend = 0;
		int divisor = 2;
		int expected = 0;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void zeroDivNeg() {
		int dividend = 0;
		int divisor = -2;
		int expected = 0;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void posDivPos() {
		int dividend = 3;
		int divisor = 2;
		int expected = 1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void negDivNeg() {
		int dividend = -3;
		int divisor = -2;
		int expected = 1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void negDivPos() {
		int dividend = -3;
		int divisor = 2;
		int expected = -1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void posDivNeg() {
		int dividend = 3;
		int divisor = -2;
		int expected = -1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMaxDiv1() {
		int dividend = Integer.MAX_VALUE;
		int divisor = 1;
		int expected = Integer.MAX_VALUE;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMinDiv1() {
		int dividend = Integer.MIN_VALUE;
		int divisor = 1;
		int expected = Integer.MIN_VALUE;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMaxDiv2() {
		int dividend = Integer.MAX_VALUE;
		int divisor = 2;
		int expected = 1073741823;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMinDiv2() {
		int dividend = Integer.MIN_VALUE;
		int divisor = 2;
		int expected = -1073741824;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void divideByIntMax() {
		int dividend = 7;
		int divisor = Integer.MAX_VALUE;
		int expected = 0;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMaxBoth() {
		int dividend = Integer.MAX_VALUE;
		int divisor = Integer.MAX_VALUE;
		int expected = 1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void intMinBoth() {
		int dividend = Integer.MIN_VALUE;
		int divisor = Integer.MIN_VALUE;
		int expected = 1;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void divideByIntMin() {
		int dividend = 12349867;
		int divisor = Integer.MIN_VALUE;
		int expected = 0;
		assertQuote(expected, dividend, divisor);
	}

	@Test
	public void overflow() {
		int dividend = Integer.MIN_VALUE;
		int divisor = -1;
		int expected = Integer.MAX_VALUE;
		assertQuote(expected, dividend, divisor);
	}

}
