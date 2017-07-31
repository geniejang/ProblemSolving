package euler.no017_NumberToWords;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertWords(String expected, long n) {
		String actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void one() {
		int n = 1;
		String expected = "One";
		assertWords(expected, n);
	}

	@Test
	public void ten() {
		int n = 10;
		String expected = "Ten";
		assertWords(expected, n);
	}

	@Test
	public void seventeen() {
		int n = 17;
		String expected = "Seventeen";
		assertWords(expected, n);
	}

	@Test
	public void maximumValue() {
		long n = 1000000000000L;
		String expected = "One Trillion";
		assertWords(expected, n);
	}

	@Test
	public void bigNumber() {
		long n = 104382426112L;
		String expected = "One Hundred Four Billion Three Hundred Eighty Two Million"
				+ " Four Hundred Twenty Six Thousand One Hundred Twelve";
		assertWords(expected, n);
	}

}
