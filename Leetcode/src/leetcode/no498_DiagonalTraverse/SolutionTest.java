package leetcode.no498_DiagonalTraverse;

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
	public void test() {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] expecteds = { 1, 2, 4, 7, 5, 3, 6, 8, 9 };
		int[] actuals = solution.findDiagonalOrder(input);
		assertArrayEquals(expecteds, actuals);
	}

}
