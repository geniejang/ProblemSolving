package leetcode.no232_ImplementQueueUsingStacks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private MyQueue solution;

	@Before
	public void setUp() throws Exception {
		solution = new MyQueue();
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
		int[] expecteds = { 1, 2, 3, 4, 5 };
		for (int n : expecteds) {
			solution.push(n);
		}
		for (int expected : expecteds) {
			int actual = solution.pop();
			assertEquals(expected, actual);
		}
	}

}
