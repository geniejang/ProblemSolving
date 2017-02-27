package leetcode.no190_ReverseBits;

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
		int num = 43261596;
		int expected = 964176192;
		int actual = solution.reverseBits2(num);
		assertEquals(expected, actual);
	}

}
