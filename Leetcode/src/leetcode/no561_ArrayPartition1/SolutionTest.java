package leetcode.no561_ArrayPartition1;

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
		int[] nums = { 1, 4, 3, 2 };
		int expected = 4;
		int actual = solution.arrayPairSum(nums);
		assertEquals(expected, actual);
	}

}
