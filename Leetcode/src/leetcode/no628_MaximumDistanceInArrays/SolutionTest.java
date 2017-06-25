package leetcode.no628_MaximumDistanceInArrays;

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

	@Test
	public void test() {
		Integer[][] nums = { { 1, 2, 3 }, { 4, 5 }, { 1, 2, 3 } };
		List<List<Integer>> arrays = new ArrayList<>();
		for (Integer[] arr : nums) {
			arrays.add(Arrays.asList(arr));
		}
		int expected = 4;
		int actual = solution.maxDistance(arrays);
		assertEquals(expected, actual);
	}

}
