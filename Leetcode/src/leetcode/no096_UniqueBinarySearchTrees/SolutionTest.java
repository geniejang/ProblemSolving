package leetcode.no096_UniqueBinarySearchTrees;

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

	private void assertNum(int expected, int n) {
		int actual = solution.numTrees(n);
		assertEquals(expected, actual);
	}

	@Test
	public void three() {
		int n = 3;
		int expected = 5;
		assertNum(expected, n);
	}

	@Test
	public void four() {
		int n = 4;
		int expected = 14;
		assertNum(expected, n);
	}

	@Test
	public void five() {
		int n = 5;
		int expected = 42;
		assertNum(expected, n);
	}

	@Test
	public void six() {
		int n = 6;
		int expected = 132;
		assertNum(expected, n);
	}

}
