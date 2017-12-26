package leetcode.no728_SelfDividingNumbers;

import static org.junit.Assert.*;

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
	public void given() {
		int left = 1;
		int right = 22;
		Integer[] expecteds = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22 };
		List<Integer> expected = Arrays.asList(expecteds);
		List<Integer> actual = solution.selfDividingNumbers(left, right);
		assertEquals(expected, actual);
	}

}
