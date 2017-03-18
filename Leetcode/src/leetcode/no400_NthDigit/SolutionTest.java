package leetcode.no400_NthDigit;

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
	public void third() {
		int n = 3;
		int expected = 3;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void nineth() {
		int n = 9;
		int expected = 9;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void tenth() {
		int n = 10;
		int expected = 1;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void eleventh() {
		int n = 11;
		int expected = 0;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void twelveth() {
		int n = 12;
		int expected = 1;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void thirteenth() {
		int n = 13;
		int expected = 1;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void fifteenth() {
		int n = 15;
		int expected = 2;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void ninetyOf99() { // 1*9 + 2*90
		int n = 1 * 9 + 2 * 90 - 1;
		int expected = 9;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void nineOf99() { // 1*9 + 2*90
		int n = 1 * 9 + 2 * 90;
		int expected = 9;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void hundredsOf123() { // 1*9 + 2*90 + 3*23
		int n = 1 * 9 + 2 * 90 + 3 * 23 + 1;
		int expected = 1;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void tensOf123() { // 1*9 + 2*90 + 3*23
		int n = 1 * 9 + 2 * 90 + 3 * 23 + 2;
		int expected = 2;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

	@Test
	public void unitOf123() { // 1*9 + 2*90 + 3*23
		int n = 1 * 9 + 2 * 90 + 3 * 23 + 3;
		int expected = 3;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void what() {
		int n = 1000000000;
		int expected = 1;
		int actual = solution.findNthDigit(n);
		assertEquals(expected, actual);
	}

}
