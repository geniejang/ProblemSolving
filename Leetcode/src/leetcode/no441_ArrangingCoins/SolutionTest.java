package leetcode.no441_ArrangingCoins;

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
	public void five() {
		int expected = 2;
		int actual = solution.arrangeCoins(5);
		assertEquals(expected, actual);
	}

	@Test
	public void eight() {
		int expected = 3;
		int actual = solution.arrangeCoins(8);
		assertEquals(expected, actual);
	}

	@Test
	public void overflow() {
		int expected = 60070;
		int actual = solution.arrangeCoins(1804289383);
		assertEquals(expected, actual);
	}

}
