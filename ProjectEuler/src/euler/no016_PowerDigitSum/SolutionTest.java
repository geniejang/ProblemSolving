package euler.no016_PowerDigitSum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertDigitSum(int expected, int n) {
		int actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void argument3Returns8() {
		int n = 3;
		int expected = 8;
		assertDigitSum(expected, n);
	}

	@Test
	public void argument4Returns7() {
		int n = 4;
		int expected = 7;
		assertDigitSum(expected, n);
	}

	@Test
	public void argument7Returns11() {
		int n = 7;
		int expected = 11;
		assertDigitSum(expected, n);
	}

}
