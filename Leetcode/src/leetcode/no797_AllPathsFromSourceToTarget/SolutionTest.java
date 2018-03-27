package leetcode.no797_AllPathsFromSourceToTarget;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

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

	private void assertPaths(List<List<Integer>> expected, int[][] graph) {
		List<List<Integer>> actual = solution.allPathsSourceTarget(graph);
		assertThat(actual, containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void example() {
		int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
		List<List<Integer>> expected = List.of(List.of(0, 1, 3), List.of(0, 2, 3));
		assertPaths(expected, graph);
	}

	@Test
	public void allToTarget() {
		int[][] graph = { { 1, 2, 3 }, { 3 }, { 3 }, {} };
		List<List<Integer>> expected = List.of(List.of(0, 3), List.of(0, 1, 3), List.of(0, 2, 3));
		assertPaths(expected, graph);
	}

	@Test
	public void noWay() {
		int[][] graph = { { 1, 2 }, { 2 }, {}, {} };
		List<List<Integer>> expected = List.of();
		assertPaths(expected, graph);
	}

}
