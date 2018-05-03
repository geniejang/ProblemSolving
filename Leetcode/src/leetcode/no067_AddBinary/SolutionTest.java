package leetcode.no067_AddBinary;

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

	private void assertAdded(String expected, String a, String b) {
		String actual = solution.addBinary(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void example() {
		String a = "11";
		String b = "1";
		String expected = "100";
		assertAdded(expected, a, b);
	}

	@Test
	public void zero() {
		String a = "000";
		String b = "0";
		String expected = "0";
		assertAdded(expected, a, b);
	}

}
