package leetcode.no207_CourseSchedule;

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

	private void assertFinish(boolean expected, int numCourses, int[][] prerequisites) {
		boolean actual = solution.canFinish(numCourses, prerequisites);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 } };
		boolean expected = true;
		assertFinish(expected, numCourses, prerequisites);
	}

	@Test
	public void example2() {
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
		boolean expected = false;
		assertFinish(expected, numCourses, prerequisites);
	}

}
