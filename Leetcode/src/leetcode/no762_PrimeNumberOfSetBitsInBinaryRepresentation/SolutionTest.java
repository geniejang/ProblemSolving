package leetcode.no762_PrimeNumberOfSetBitsInBinaryRepresentation;

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

	private void assertBits(int expected, int L, int R) {
		int actual = solution.countPrimeSetBits(L, R);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int L = 6;
		int R = 10;
		int expected = 4;
		assertBits(expected, L, R);
	}

	@Test
	public void example2() {
		int L = 10;
		int R = 15;
		int expected = 5;
		assertBits(expected, L, R);
	}

}
