package leetcode.no050_PowerN;

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

	private void assertPower(double expected, double x, int n) {
		double actual = solution.myPow(x, n);
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void example1() {
		double x = 2;
		int n = 10;
		double expected = 1024.;
		assertPower(expected, x, n);
	}

	@Test
	public void example2() {
		double x = 2.1;
		int n = 3;
		double expected = 9.261000;
		assertPower(expected, x, n);
	}

	@Test
	public void zeroPowerZero() {
		double x = 0;
		int n = 0;
		double expected = 1;
		assertPower(expected, x, n);
	}

	@Test
	public void powerZero() {
		double x = 7;
		int n = 0;
		double expected = 1;
		assertPower(expected, x, n);
	}

	@Test
	public void power1() {
		double x = 7;
		int n = 1;
		double expected = 7;
		assertPower(expected, x, n);
	}

	@Test
	public void power2() {
		double x = 7;
		int n = 2;
		double expected = 49;
		assertPower(expected, x, n);
	}

	@Test
	public void power3() {
		double x = 7;
		int n = 3;
		double expected = 343;
		assertPower(expected, x, n);
	}

	@Test
	public void power15() {
		double x = 7;
		int n = 15;
		double expected = 4747561509943.0;
		assertPower(expected, x, n);
	}

	@Test
	public void power10() {
		double x = 7;
		int n = 10;
		double expected = 282475249.0;
		assertPower(expected, x, n);
	}

	@Test
	public void power5() {
		double x = 7;
		int n = 5;
		double expected = 16807.0;
		assertPower(expected, x, n);
	}

	@Test
	public void power7() {
		double x = 7;
		int n = 7;
		double expected = 823543.0;
		assertPower(expected, x, n);
	}

	@Test
	public void powerNeg() {
		double x = 7;
		int n = -1;
		double expected = 0.14286;
		assertPower(expected, x, n);
	}

	@Test
	public void powerNeg2() {
		double x = 7;
		int n = -3;
		double expected = 0.00292;
		assertPower(expected, x, n);
	}

	@Test
	public void powerIntMin() {
		double x = 2;
		int n = Integer.MIN_VALUE;
		double expected = 0;
		assertPower(expected, x, n);
	}

}
