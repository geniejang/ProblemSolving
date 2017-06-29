package leetcode.no629_KInversePairsArray;

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

	private void assertPairs(int n, int k, int expected) {
		int actual = solution.kInversePairs(n, k);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		int n = 3;
		int k = 0;
		int expected = 1;
		assertPairs(n, k, expected);
	}

	@Test
	public void test2() {
		int n = 3;
		int k = 1;
		int expected = 2;
		assertPairs(n, k, expected);
	}

	@Test
	public void test3() {
		int n = 2;
		int k = 2;
		int expected = 0;
		assertPairs(n, k, expected);
	}

}
