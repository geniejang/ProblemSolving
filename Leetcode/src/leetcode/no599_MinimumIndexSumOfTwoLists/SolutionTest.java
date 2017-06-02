package leetcode.no599_MinimumIndexSumOfTwoLists;

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
	public void onlyOneSameRestaurant() {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		String[] expecteds = { "Shogun" };
		String[] actuals = solution.findRestaurant(list1, list2);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void oneMinimumIndexSum() {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "KFC", "Shogun", "Burger King" };
		String[] expecteds = { "Shogun" };
		String[] actuals = solution.findRestaurant(list1, list2);
		assertArrayEquals(expecteds, actuals);
	}

}
