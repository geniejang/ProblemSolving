package euler.no018_MaximumPathSum1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[][] nums = { { 3 }, { 7, 4 }, { 2, 4, 6 }, { 8, 5, 9, 3 } };
		int expected = 23;
		int actual = Solution.solve(nums);
		assertEquals(expected, actual);
	}

}
