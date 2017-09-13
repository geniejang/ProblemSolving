package leetcode.no435_NonOverlappingIntervals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.Interval;

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

	private void assertIntervals(int expected, int[][] intervals) {
		int actual = solution.eraseOverlapIntervals(Interval.from(intervals));
		assertEquals(expected, actual);
	}

	@Test
	public void oneOverlapping() {
		int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
		int expected = 1;
		assertIntervals(expected, intervals);
	}

	@Test
	public void allOverlapping() {
		int[][] intervals = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
		int expected = 2;
		assertIntervals(expected, intervals);
	}

	@Test
	public void noOverlapping() {
		int[][] intervals = { { 1, 2 }, { 2, 3 } };
		int expected = 0;
		assertIntervals(expected, intervals);
	}

}
