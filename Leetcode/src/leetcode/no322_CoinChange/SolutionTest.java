package leetcode.no322_CoinChange;

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
	public void available() {
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		int expected = 3;
		int actual = solution.coinChange(coins, amount);
		assertEquals(expected, actual);
	}

	@Test
	public void unavailable() {
		int[] coins = { 2 };
		int amount = 3;
		int expected = -1;
		int actual = solution.coinChange(coins, amount);
		assertEquals(expected, actual);
	}

	@Test
	public void zero() {
		int[] coins = { 1 };
		int amount = 0;
		int expected = 0;
		int actual = solution.coinChange(coins, amount);
		assertEquals(expected, actual);
	}

	@Test
	public void fourCoins() {
		int[] coins = { 1, 2, 5, 10 };
		int amount = 18;
		int expected = 4;
		int actual = solution.coinChange(coins, amount);
		assertEquals(expected, actual);
	}

	@Test
	public void hugeAmount() {
		int[] coins = { 94, 91, 377, 368, 207, 40, 415, 61 };
		int amount = 9662;
		int expected = 25;
		int actual = solution.coinChange(coins, amount);
		assertEquals(expected, actual);
	}

}
