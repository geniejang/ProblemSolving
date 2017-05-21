package leetcode.no575_DistributeCandies;

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
	public void test1() {
		int[] nums = { 1, 1, 2, 2, 3, 3 };
		int expected = 3;
		int actual = solution.distributeCandies(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] nums = { 1, 1, 2, 3 };
		int expected = 2;
		int actual = solution.distributeCandies(nums);
		assertEquals(expected, actual);
	}

}
