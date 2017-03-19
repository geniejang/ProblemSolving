package leetcode.no405_ConvertNumberToHexadecimal;

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

	private void assertHex(String expected, int num) {
		String actual = solution.toHex2(num);
		assertEquals(expected, actual);
	}

	@Test
	public void zero() {
		int num = 0;
		String expected = "0";
		assertHex(expected, num);
	}

	@Test
	public void twentySix() {
		int num = 26;
		String expected = "1a";
		assertHex(expected, num);
	}
	
	@Test
	public void minusOne() {
		int num = -1;
		String expected = "ffffffff";
		assertHex(expected, num);
	}

}
