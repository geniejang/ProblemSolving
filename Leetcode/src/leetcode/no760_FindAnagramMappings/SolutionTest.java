package leetcode.no760_FindAnagramMappings;

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
		int[] A = { 12, 28, 46, 32, 50 };
		int[] B = { 50, 12, 32, 46, 28 };
		int[] expecteds = { 1, 4, 3, 2, 0 };
		int[] actuals = solution.anagramMappings(A, B);
		assertArrayEquals(expecteds, actuals);
	}

}
