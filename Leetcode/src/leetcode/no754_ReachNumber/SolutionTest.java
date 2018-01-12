package leetcode.no754_ReachNumber;

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

	private void assertNumber(int expected, int target) {
		int actual = solution.reachNumber(target);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		int target = 3;
		int expected = 2;
		assertNumber(expected, target);
	}

	@Test
	public void test2() {
		int target = 2;
		int expected = 3;
		assertNumber(expected, target);
	}

	@Test
	public void bigPositive() {
		int target = 1000000000;
		int expected = 44723;
		assertNumber(expected, target);
	}

	@Test
	public void bigNegative() {
		int target = -1000000000;
		int expected = 44723;
		assertNumber(expected, target);
	}

}
