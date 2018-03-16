package leetcode.no684_RedundantConnection;

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

	private void assertRedundant(int[] expected, int[][] edges) {
		int[] actual = solution.findRedundantConnection(edges);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] edges = { { 1, 2 }, { 1, 3 }, { 2, 3 } };
		int[] expected = { 2, 3 };
		assertRedundant(expected, edges);
	}

	@Test
	public void example2() {
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 1, 5 } };
		int[] expected = { 1, 4 };
		assertRedundant(expected, edges);
	}

}
