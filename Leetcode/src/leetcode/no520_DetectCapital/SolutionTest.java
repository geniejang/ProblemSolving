package leetcode.no520_DetectCapital;

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

	private void assertDetecting(boolean expected, String word) {
		boolean actual = solution.detectCapitalUse(word);
		assertEquals(expected, actual);
	}

	@Test
	public void uppersOnly() {
		assertDetecting(true, "USA");
	}

	@Test
	public void lowersOnly() {
		assertDetecting(true, "leetcode");
	}

	@Test
	public void upperFirstOnly() {
		assertDetecting(true, "Leetcode");
	}

	@Test
	public void singleUpper() {
		assertDetecting(true, "I");
	}

	@Test
	public void singleLower() {
		assertDetecting(true, "l");
	}

	@Test
	public void UpperAfterlower() {
		assertDetecting(false, "eP");
	}

	@Test
	public void UpperAtLast() {
		assertDetecting(false, "essaY");
	}

}
