package leetcode.no136_SingleNumber;

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
	public void seven() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 3, 2, 1 };
		int expected = 4;
		int actual = solution.singleNumber(nums);
		assertEquals(expected, actual);
	}

}
