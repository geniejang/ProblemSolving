package euler.no007_10001stPrime;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertPrime(long expected, int n) {
		long actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void argument3Returns5() {
		int n = 3;
		int expected = 5;
		assertPrime(expected, n);
	}

	@Test
	public void argument6Returns13() {
		int n = 6;
		int expected = 13;
		assertPrime(expected, n);
	}

	@Test
	public void argumentMax() {
		int n = 10000;
		long expected = 104729;
		assertPrime(expected, n);
	}

}
