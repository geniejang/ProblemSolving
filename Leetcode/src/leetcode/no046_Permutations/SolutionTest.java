package leetcode.no046_Permutations;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.*;

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

	private void assertPermutations(List<List<Integer>> expected, int[] nums) {
		List<List<Integer>> actual = solution.permute(nums);
		assertThat(actual, containsInAnyOrder(expected.toArray()));
	}

	@Test
	public void example() {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1),
				List.of(3, 1, 2), List.of(3, 2, 1));
		assertPermutations(expected, nums);
	}

}
