package leetcode.no218_SkylineProblem;

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

	private void assertSkyline(int[][] expecteds, int[][] buildings) {
		List<int[]> actual = solution.getSkyline(buildings);
		assertThat(actual, containsInAnyOrder(expecteds));
	}

	@Test
	public void example() {
		int[][] buildings = { { 2, 9, 10 }, { 3, 7, 15 }, { 5, 12, 12 }, { 15, 20, 10 }, { 19, 24, 8 } };
		int[][] expecteds = { { 2, 10 }, { 3, 15 }, { 7, 12 }, { 12, 0 }, { 15, 10 }, { 20, 8 }, { 24, 0 } };
		assertSkyline(expecteds, buildings);
	}

	@Test
	public void sameLefts() {
		int[][] buildings = { { 1, 2, 1 }, { 1, 2, 2 }, { 1, 2, 3 } };
		int[][] expecteds = { { 1, 3 }, { 2, 0 } };
		assertSkyline(expecteds, buildings);
	}

}
