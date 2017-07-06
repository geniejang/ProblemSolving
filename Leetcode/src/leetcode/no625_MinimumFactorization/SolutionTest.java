package leetcode.no625_MinimumFactorization;

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

	@Test
	public void fourtyEight() {
		int num = 48;
		int expected = 68;
		int actual = solution.smallestFactorization(num);
		assertEquals(expected, actual);
	}

	@Test
	public void fifteen() {
		int num = 15;
		int expected = 35;
		int actual = solution.smallestFactorization(num);
		assertEquals(expected, actual);
	}

}
