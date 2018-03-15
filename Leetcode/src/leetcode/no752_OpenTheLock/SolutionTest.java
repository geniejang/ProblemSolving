package leetcode.no752_OpenTheLock;

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

	private void assertRotations(int expected, String[] deadends, String target) {
		int actual = solution.openLock(deadends, target);
		assertEquals(expected, actual);
	}

	@Test
	public void parsint() {
		String zero = "0000";
		int expected = 0;
		int actual = Integer.valueOf(zero);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String[] deadends = { "0201", "0101", "0102", "1212", "2002" };
		String target = "0202";
		int expected = 6;
		assertRotations(expected, deadends, target);
	}

	@Test
	public void example2() {
		String[] deadends = { "8888" };
		String target = "0009";
		int expected = 1;
		assertRotations(expected, deadends, target);
	}

	@Test
	public void example3() {
		String[] deadends = { "8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888" };
		String target = "8888";
		int expected = -1;
		assertRotations(expected, deadends, target);
	}

	@Test
	public void example4() {
		String[] deadends = { "0000" };
		String target = "8888";
		int expected = -1;
		assertRotations(expected, deadends, target);
	}

}
