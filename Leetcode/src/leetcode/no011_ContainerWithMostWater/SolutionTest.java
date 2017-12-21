package leetcode.no011_ContainerWithMostWater;

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
		int[] height = { 1, 3, 2, 3, 1 };
		int expected = 6;
		int actual = solution.maxArea(height);
		assertEquals(expected, actual);
	}

}
