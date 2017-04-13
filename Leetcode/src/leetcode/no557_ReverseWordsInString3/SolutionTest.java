package leetcode.no557_ReverseWordsInString3;

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
	public void test() {
		String s = "Let's take LeetCode contest";
		String expected = "s'teL ekat edoCteeL tsetnoc";
		String actual = solution.reverseWords(s);
		assertEquals(expected, actual);
	}

}
