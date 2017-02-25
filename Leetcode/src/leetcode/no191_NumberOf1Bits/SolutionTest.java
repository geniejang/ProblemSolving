package leetcode.no191_NumberOf1Bits;

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
	public void test() {
		int num = 11;
		int expected = 3;
		int actual = solution.hammingWeight(num);
		assertEquals(expected, actual);
	}

}
