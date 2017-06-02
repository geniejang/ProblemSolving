package leetcode.no598_RangeAddition2;

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
		int m = 3;
		int n = 3;
		int[][] ops = { { 2, 2 }, { 3, 3 } };
		int expected = 4;
		int actual = solution.maxCount(m, n, ops);
		assertEquals(expected, actual);
	}

}
