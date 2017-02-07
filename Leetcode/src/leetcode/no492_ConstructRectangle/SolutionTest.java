package leetcode.no492_ConstructRectangle;

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
	public void test() {
		int[] actuals = solution.constructRectangle(4);
		int[] expecteds = new int[] { 2, 2 };
		assertArrayEquals(expecteds, actuals);
	}

}
