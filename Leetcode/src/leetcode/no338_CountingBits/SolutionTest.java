package leetcode.no338_CountingBits;

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

	private void assertBits(int[] expecteds, int num) {
		int[] actuals = solution.countBits(num);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void example() {
		int num = 5;
		int[] expecteds = { 0, 1, 1, 2, 1, 2 };
		assertBits(expecteds, num);
	}

	@Test
	public void zero() {
		int num = 0;
		int[] expecteds = { 0 };
		assertBits(expecteds, num);
	}

	@Test
	public void one() {
		int num = 1;
		int[] expecteds = { 0, 1 };
		assertBits(expecteds, num);
	}

	@Test
	public void two() {
		int num = 2;
		int[] expecteds = { 0, 1, 1 };
		assertBits(expecteds, num);
	}

	@Test
	public void three() {
		int num = 3;
		int[] expecteds = { 0, 1, 1, 2 };
		assertBits(expecteds, num);
	}

	@Test
	public void four() {
		int num = 4;
		int[] expecteds = { 0, 1, 1, 2, 1 };
		assertBits(expecteds, num);
	}

	@Test
	public void ten() {
		int num = 10;
		int[] expecteds = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2 };
		assertBits(expecteds, num);
	}

}
