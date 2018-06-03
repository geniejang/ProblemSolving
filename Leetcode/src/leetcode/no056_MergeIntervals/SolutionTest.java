package leetcode.no056_MergeIntervals;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

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

	private void assertMerged(int[][] expecteds, int[][] intervals) {
		List<Interval> actual = solution.merge(Arrays.asList(Interval.from(intervals)));
		assertArrayEquals(Interval.from(expecteds), actual.toArray());
	}

	@Test
	public void example1() {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] expecteds = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
		assertMerged(expecteds, intervals);
	}

	@Test
	public void example2() {
		int[][] intervals = { { 1, 4 }, { 4, 5 } };
		int[][] expecteds = { { 1, 5 } };
		assertMerged(expecteds, intervals);
	}

	@Test
	public void includedSuccessor() {
		int[][] intervals = { { 1, 4 }, { 2, 3 } };
		int[][] expecteds = { { 1, 4 } };
		assertMerged(expecteds, intervals);
	}

}
