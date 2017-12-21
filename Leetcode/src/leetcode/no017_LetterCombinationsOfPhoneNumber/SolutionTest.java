package leetcode.no017_LetterCombinationsOfPhoneNumber;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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

	/**
	 * 1: -
	 * 2: a, b, c
	 * 3: d, e, f
	 * 4: g, h, i
	 * 5: j, k, l
	 * 6: m, n, o
	 * 7: p, q, r, s
	 * 8: t, u, v
	 * 9: w, x, y, z
	 * 0: -
	 */

	@Test
	public void emptyInput() {
		String digits = "";
		List<String> expected = new ArrayList<>();
		List<String> actual = solution.letterCombinations(digits);
		assertEquals(expected, actual);
	}

	@Test
	public void twoDigits() {
		String digits = "23";
		List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
		List<String> actual = solution.letterCombinations(digits);
		assertEquals(expected, actual);
	}

}
