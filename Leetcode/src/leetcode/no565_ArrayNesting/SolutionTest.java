package leetcode.no565_ArrayNesting;

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
	public void test() {
		int[] nums = { 5, 4, 0, 3, 1, 6, 2 };
		int expected = 4;
		int actual = solution.arrayNesting(nums);
		assertEquals(expected, actual);
	}

}
