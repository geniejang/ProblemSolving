package leetcode.no413_ArithmeticSlices;

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

	private void assertSlices(int expected, int[] A) {
		int actual = solution.numberOfArithmeticSlices(A);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		int[] nums = { 1, 2, 3, 4 };
		int expected = 3;
		assertSlices(expected, nums);
	}

	@Test
	public void random() {
		int[] nums = { 1, 2, 3, 4, 4, 6, 8, 0, 2, 4, 6, 8, 10, 13, 16, 19, 17, 15, 13, 11, 9, 7, 5, 3, 20, 25, 30, 35,
				71, 73, 75, 77 };
		int expected = 51;
		assertSlices(expected, nums);
	}

}
