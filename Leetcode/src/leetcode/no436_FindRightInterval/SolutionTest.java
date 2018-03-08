package leetcode.no436_FindRightInterval;

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

	private void assertRightIntervals(int[] expecteds, int[][] intervals) {
		int[] actuals = solution.findRightInterval(Interval.from(intervals));
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void example1() {
		int[][] intervals = { { 1, 2 } };
		int[] expecteds = { -1 };
		assertRightIntervals(expecteds, intervals);
	}

	@Test
	public void example2() {
		int[][] intervals = { { 3, 4 }, { 2, 3 }, { 1, 2 } };
		int[] expecteds = { -1, 0, 1 };
		assertRightIntervals(expecteds, intervals);
	}

	@Test
	public void example3() {
		int[][] intervals = { { 1, 4 }, { 2, 3 }, { 3, 4 } };
		int[] expecteds = { -1, 2, -1 };
		assertRightIntervals(expecteds, intervals);
	}

	@Test
	public void nextStartBiggerThanPrevEnd() {
		int[][] intervals = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		int[] expecteds = { 1, 2, -1 };
		assertRightIntervals(expecteds, intervals);
	}

}
