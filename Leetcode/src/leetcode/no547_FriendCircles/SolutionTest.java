package leetcode.no547_FriendCircles;

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

	private void assertCircles(int expected, int[][] M) {
		int actual = solution.findCircleNum(M);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[][] M = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int expected = 2;
		assertCircles(expected, M);
	}

	@Test
	public void example2() {
		int[][] M = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		int expected = 1;
		assertCircles(expected, M);
	}

}
