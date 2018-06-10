package leetcode.no260_SingleNumber3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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

	private void assertSingleNumbers(int[] expecteds, int[] nums) {
		int[] actuals = solution.singleNumber(nums);
		assertNotNull(actuals);
		assertNotEquals(actuals[0], actuals[1]);
		assertThat(actuals[0], anyOf(is(expecteds[0]), is(expecteds[1])));
		assertThat(actuals[1], anyOf(is(expecteds[0]), is(expecteds[1])));
	}

	@Test
	public void example() {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] expecteds = { 3, 5 };
		assertSingleNumbers(expecteds, nums);
	}

	@Test
	public void exampleAnotherAnswer() {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] expecteds = { 5, 3 };
		assertSingleNumbers(expecteds, nums);
	}

	@Test
	public void singleNumbersOnly() {
		int[] nums = { 1, 2 };
		int[] expecteds = { 1, 2 };
		assertSingleNumbers(expecteds, nums);
	}

}
