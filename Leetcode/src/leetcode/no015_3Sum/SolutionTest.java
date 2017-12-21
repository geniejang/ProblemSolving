package leetcode.no015_3Sum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

	private static final Comparator<List<Integer>> COMP = (l1, l2) -> {
		if (l1 == l2)
			return 0;
		if (l1 == null)
			return -1;
		if (l2 == null)
			return 1;
		for (int i = 0; i < l1.size(); i++) {
			int diff = l1.get(i) - l2.get(i);
			if (diff != 0) {
				return diff;
			}
		}
		return 0;
	};

	private void assert3Sum(List<List<Integer>> expected, int[] nums) {
		List<List<Integer>> actual = solution.threeSum(nums);
		expected.sort(COMP);
		actual.sort(COMP);
		assertEquals(expected, actual);
	}

	@Test
	public void allZeroes() {
		int[] nums = { 0, 0, 0 };
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(new Integer[] { 0, 0, 0 }));
		assert3Sum(expected, nums);
	}

	@Test
	public void twoMinusOnes() {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(new Integer[] { -1, 0, 1 }));
		expected.add(Arrays.asList(new Integer[] { -1, -1, 2 }));
		assert3Sum(expected, nums);
	}

	@Test
	public void twoPlusOnes() {
		int[] nums = { -2, 0, 1, 1, 2 };
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(new Integer[] { -2, 0, 2 }));
		expected.add(Arrays.asList(new Integer[] { -2, 1, 1 }));
		assert3Sum(expected, nums);
	}

}
