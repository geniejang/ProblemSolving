package leetcode.no771_JewelsAndStones;

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

	private void assertJewels(int expected, String J, String S) {
		int actual = solution.numJewelsInStones(J, S);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String J = "aA";
		String S = "aAAbbbb";
		int expected = 3;
		assertJewels(expected, J, S);
	}

	@Test
	public void example2() {
		String J = "z";
		String S = "ZZ";
		int expected = 0;
		assertJewels(expected, J, S);
	}

}
