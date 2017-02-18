package leetcode.no476_NumberComplement;

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

	private void assertComplement(int expected, int num) {
		int actual = solution.findComplement(num);
		assertEquals(expected, actual);
	}

	@Test
	public void five() {
		assertComplement(2, 5);
	}

	@Test
	public void two() {
		assertComplement(0, 1);
	}
}
