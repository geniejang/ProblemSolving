package leetcode.no368_LargestDivisibleSubset;

import static org.hamcrest.Matchers.*;

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

	private void assertSubset(List<Integer> expected, int[] nums) {
		List<Integer> actual = solution.largestDivisibleSubset(nums);
		assertThat(actual, containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void emptyInput() {
		int[] nums = {};
		List<Integer> expected = List.of();
		assertSubset(expected, nums);
	}

	@Test
	public void example1() {
		int[] nums = { 1, 2, 3 };
		List<Integer> expected = List.of(1, 2);
		assertSubset(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = { 1, 2, 4, 8 };
		List<Integer> expected = List.of(1, 2, 4, 8);
		assertSubset(expected, nums);
	}

	@Test
	public void example3() {
		int[] nums = { 3, 4, 16, 8 };
		List<Integer> expected = List.of(4, 8, 16);
		assertSubset(expected, nums);
	}

}
