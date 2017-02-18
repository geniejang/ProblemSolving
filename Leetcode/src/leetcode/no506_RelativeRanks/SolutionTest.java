package leetcode.no506_RelativeRanks;

import static org.junit.Assert.*;

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

	@Test
	public void sortedInput() {
		int[] input = { 5, 4, 3, 2, 1 };
		String[] expecteds = { "Gold Medal", "Silver Medal", "Bronze Medal", "4", "5" };
		String[] actuals = solution.findRelativeRanks(input);
		assertArrayEquals(expecteds, actuals);
	}

}
