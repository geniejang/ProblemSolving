package leetcode.no168_ExcelSheetColumnTitle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	public void assertConverting(int n, String expected) {
		String actual = solution.convertToTitle(n);
		assertTrue(actual, expected.equals(actual));
	}

	@Test
	public void convertA() {
		assertConverting(1, "A");
	}

	@Test
	public void convertY() {
		assertConverting(25, "Y");
	}

	@Test
	public void convertZ() {
		assertConverting(26, "Z");
	}

	@Test
	public void convertAA() {
		assertConverting(26 * 1 + 1, "AA");
	}

	@Test
	public void convertAZ() {
		assertConverting(26 * 1 + 26, "AZ");
	}

	@Test
	public void convertBZ() {
		assertConverting(26 * 2 + 26, "BZ");
	}

	@Test
	public void convertZZ() {
		assertConverting(26 * 26 + 26, "ZZ");
	}

	@Test
	public void convertAAA() {
		assertConverting(26 * 26 * 1 + 26 * 1 + 1, "AAA");
	}

}
