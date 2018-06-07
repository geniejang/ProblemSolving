package leetcode.no228_SummaryRanges;

import static org.junit.Assert.*;

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

	private void assertSummary(List<String> expected, int[] nums) {
		List<String> actual = solution.summaryRanges(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] nums = { 0, 1, 2, 4, 5, 7 };
		List<String> expected = List.of("0->2", "4->5", "7");
		assertSummary(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 0, 2, 3, 4, 6, 8, 9 };
		List<String> expected = List.of("0", "2->4", "6", "8->9");
		assertSummary(expected, nums);
	}

	@Test
	public void empty() {
		int[] nums = {};
		List<String> expected = List.of();
		assertSummary(expected, nums);
	}

	@Test
	public void singleNumber() {
		int[] nums = { 3 };
		List<String> expected = List.of("3");
		assertSummary(expected, nums);
	}

}
