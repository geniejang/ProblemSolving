package leetcode.no287_FindDuplicateNumber;

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
		int[] nums = { 5, 2, 3, 4, 6, 7, 8, 1, 3 };
		int expected = 3;
		int actual = solution.findDuplicate(nums);
		assertEquals(expected, actual);
	}

}
