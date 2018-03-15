package leetcode.no210_CourseSchedule2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.collection.IsIn;
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

	private void assertOrder(List<List<Integer>> expecteds, int numCourses, int[][] prerequisites) {
		int[] actuals = solution.findOrder(numCourses, prerequisites);
		List<Integer> actualList = Arrays.stream(actuals).boxed().collect(Collectors.toList());
		assertThat(actualList, IsIn.isIn(expecteds));
	}

	@Test
	public void example1() {
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 } };
		List<List<Integer>> expecteds = List.of(List.of(0, 1));
		assertOrder(expecteds, numCourses, prerequisites);
	}

	@Test
	public void example2() {
		int numCourses = 4;
		int[][] prerequisites = { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } };
		List<List<Integer>> expecteds = List.of(List.of(0, 1, 2, 3), List.of(0, 2, 1, 3));
		assertOrder(expecteds, numCourses, prerequisites);
	}

	@Test
	public void example3() {
		int numCourses = 2;
		int[][] prerequisites = { { 0, 1 } };
		List<List<Integer>> expecteds = List.of(List.of(1, 0));
		assertOrder(expecteds, numCourses, prerequisites);
	}

}
