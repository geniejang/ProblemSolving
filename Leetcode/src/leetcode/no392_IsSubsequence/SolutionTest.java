package leetcode.no392_IsSubsequence;

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
	public void caseTrue() {
		assertTrue(solution.isSubsequence("abc", "ahbgdc"));
	}

	@Test
	public void caseFalse() {
		assertFalse(solution.isSubsequence("axc", "ahbgdc"));
	}

}
