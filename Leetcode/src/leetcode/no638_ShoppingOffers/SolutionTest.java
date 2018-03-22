package leetcode.no638_ShoppingOffers;

import static org.junit.Assert.*;

import java.util.List;

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

	private void assertEstimate(int expected, List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
		int actual = solution.shoppingOffers(price, special, needs);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		List<Integer> price = List.of(2, 5);
		List<List<Integer>> special = List.of(List.of(3, 0, 5), List.of(1, 2, 10));
		List<Integer> needs = List.of(3, 2);
		int expected = 14;
		assertEstimate(expected, price, special, needs);
	}

	@Test
	public void example2() {
		List<Integer> price = List.of(2, 3, 4);
		List<List<Integer>> special = List.of(List.of(1, 1, 0, 4), List.of(2, 2, 1, 9));
		List<Integer> needs = List.of(1, 2, 1);
		int expected = 11;
		assertEstimate(expected, price, special, needs);
	}

}
