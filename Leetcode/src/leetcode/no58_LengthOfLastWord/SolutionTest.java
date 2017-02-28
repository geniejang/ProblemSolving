package leetcode.no58_LengthOfLastWord;

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
	public void helloWorld() {
		String s = "Hello world";
		int expected = 5;
		int actual = solution.lengthOfLastWord(s);
		assertEquals(expected, actual);
	}

}
