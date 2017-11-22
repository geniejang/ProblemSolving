package leetcode.no122_BestTimeToBuyAndSellStock2;

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
	public void increasing() {
		int[] prices = { 1, 2, 3, 4, 5, 6, 7 };
		int expected = 6;
		int actual = solution.maxProfit(prices);
		assertEquals(expected, actual);
	}

	@Test
	public void decreasing() {
		int[] prices = { 7, 6, 5, 4, 3, 2, 1 };
		int expected = 0;
		int actual = solution.maxProfit(prices);
		assertEquals(expected, actual);
	}

	@Test
	public void twoTransactions() {
		int[] prices = { 1, 3, 5, 2, 4, 6, 1 };
		int expected = 8;
		int actual = solution.maxProfit(prices);
		assertEquals(expected, actual);
	}

}
