package leetcode.no769_MaxChunksToMakeSorted;

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

	private void assertChunks(int expected, int[] arr) {
		int actual = solution.maxChunksToSorted(arr);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] arr = { 4, 3, 2, 1, 0 };
		int expected = 1;
		assertChunks(expected, arr);
	}

	@Test
	public void example2() {
		int[] arr = { 1, 0, 2, 3, 4 };
		int expected = 4;
		assertChunks(expected, arr);
	}

}
