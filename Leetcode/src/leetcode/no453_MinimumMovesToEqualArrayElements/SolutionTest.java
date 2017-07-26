package leetcode.no453_MinimumMovesToEqualArrayElements;

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
		int[] nums = { 1, 2, 3 };
		int expected = 3;
		int actual = solution.minMoves(nums);
		assertEquals(expected, actual);
	}

}
