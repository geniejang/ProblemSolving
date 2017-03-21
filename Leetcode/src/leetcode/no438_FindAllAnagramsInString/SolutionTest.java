package leetcode.no438_FindAllAnagramsInString;

import static org.junit.Assert.*;

import java.util.List;

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

	private void assertAnagrams(Integer[] expecteds, String s, String p) {
		List<Integer> actuals = solution.findAnagrams(s, p);
		assertArrayEquals(expecteds, actuals.toArray());
	}

	@Test
	public void test() {
		String s = "cbaebabacd";
		String p = "abc";
		Integer[] expecteds = { 0, 6 };
		assertAnagrams(expecteds, s, p);
	}

	@Test
	public void overlaps() {
		String s = "ababab";
		String p = "ab";
		Integer[] expecteds = { 0, 1, 2, 3, 4 };
		assertAnagrams(expecteds, s, p);
	}

}
