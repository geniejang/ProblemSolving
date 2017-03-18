package leetcode.no539_MinimumTimeDifference;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertDifference(String[] timeArray, int expected) {
		List<String> timePoints = Arrays.asList(timeArray);
		int actual = solution.findMinDifference(timePoints);
		assertEquals(expected, actual);
	}

	@Test
	public void justOne() {
		String[] timeArray = { "07:00", "08:00" };
		int expected = 60;
		assertDifference(timeArray, expected);
	}

	@Test
	public void overnight() {
		String[] timeArray = { "23:59", "00:00" };
		int expected = 1;
		assertDifference(timeArray, expected);
	}

}
