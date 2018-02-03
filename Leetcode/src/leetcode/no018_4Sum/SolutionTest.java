package leetcode.no018_4Sum;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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

	private void assert4Sum(Integer[][] expecteds, int[] nums, int target) {
		List<List<Integer>> expected = new ArrayList<>();
		for (Integer[] arr : expecteds) {
			expected.add(Arrays.asList(arr));
		}
		List<List<Integer>> actual = solution.fourSum(nums, target);
		assertThat(actual.toString(), actual, hasSize(expected.size()));
		for (List<Integer> list : expected) {
			assertThat(actual, hasItem(list));
		}
	}

	@Test
	public void example() {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		Integer[][] expecteds = { { -1, 0, 0, 1 }, { -2, -1, 1, 2 }, { -2, 0, 0, 2 } };
		assert4Sum(expecteds, nums, target);
	}

	@Test
	public void example2() {
		int[] nums = { -3, -2, -1, 0, 0, 1, 2, 3 };
		int target = 0;
		Integer[][] expecteds = { { -3, -2, 2, 3 }, { -3, -1, 1, 3 }, { -3, 0, 0, 3 }, { -3, 0, 1, 2 },
				{ -2, -1, 0, 3 }, { -2, -1, 1, 2 }, { -2, 0, 0, 2 }, { -1, 0, 0, 1 } };
		assert4Sum(expecteds, nums, target);
	}

	@Test
	public void allZeroes() {
		int[] nums = { 0, 0, 0, 0 };
		int target = 0;
		Integer[][] expecteds = { { 0, 0, 0, 0 } };
		assert4Sum(expecteds, nums, target);
	}

	@Test
	public void negativeTarget1() {
		int[] nums = { 1, -2, -5, -4, -3, 3, 3, 5 };
		int target = -11;
		Integer[][] expecteds = { { -5, -4, -3, 1 } };
		assert4Sum(expecteds, nums, target);
	}

	@Test
	public void negativeTarget2() {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		int target = -1;
		Integer[][] expecteds = { { -4, 0, 1, 2 }, { -1, -1, 0, 1 } };
		assert4Sum(expecteds, nums, target);
	}

}
