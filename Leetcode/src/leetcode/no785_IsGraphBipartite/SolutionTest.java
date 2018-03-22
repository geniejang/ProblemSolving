package leetcode.no785_IsGraphBipartite;

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

	private void assertBipartite(boolean expected, int[][] graph) {
		boolean actual = solution.isBipartite(graph);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
		boolean expected = true;
		assertBipartite(expected, graph);
	}

	@Test
	public void example2() {
		int[][] graph = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
		boolean expected = false;
		assertBipartite(expected, graph);
	}

}
