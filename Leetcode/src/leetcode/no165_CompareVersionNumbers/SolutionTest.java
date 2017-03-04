package leetcode.no165_CompareVersionNumbers;

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
	public void differentMajors() {
		String version1 = "0.1";
		String version2 = "1.1";
		int expected = -1;
		int actual = solution.compareVersion(version1, version2);
		assertEquals(expected, actual);
	}

	@Test
	public void differentMinors() {
		String version1 = "1.2";
		String version2 = "1.1";
		int expected = 1;
		int actual = solution.compareVersion(version1, version2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void same() {
		String version1 = "1.1.0";
		String version2 = "1.1";
		int expected = 0;
		int actual = solution.compareVersion(version1, version2);
		assertEquals(expected, actual);
	}

}
