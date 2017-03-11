package leetcode.no387_FirstUniqueCharacterInString;

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
	public void leetcode() {
		String s = "leetcode";
		int expected = 0;
		int actual = solution.firstUniqChar(s);
		assertEquals(expected, actual);
	}

	@Test
	public void loveleetcode() {
		String s = "loveleetcode";
		int expected = 2;
		int actual = solution.firstUniqChar(s);
		assertEquals(expected, actual);
	}

}
