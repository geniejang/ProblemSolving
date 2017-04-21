package leetcode.no553_OptimalDivision;

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

	private void assertOptimal(String expected, int[] nums) {
		String actual = solution.optimalDivision(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void singleNum() {
		int[] nums = { 2 };
		String expected = "2";
		assertOptimal(expected, nums);
	}

	@Test
	public void twoNums() {
		int[] nums = { 2, 1 };
		String expected = "2/1";
		assertOptimal(expected, nums);
	}

	@Test
	public void manyNums() {
		int[] nums = { 1000, 100, 10, 2 };
		String expected = "1000/(100/10/2)";
		assertOptimal(expected, nums);
	}

}
