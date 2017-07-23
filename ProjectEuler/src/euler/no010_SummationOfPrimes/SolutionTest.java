package euler.no010_SummationOfPrimes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertSumOfPrimes(long expected, int n) {
		long actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void sumOfPrimesNotGreaterThan5Is10() {
		int n = 5;
		int expected = 10;
		assertSumOfPrimes(expected, n);
	}

	@Test
	public void sumOfPrimesNotGreaterThan10Is17() {
		int n = 10;
		int expected = 17;
		assertSumOfPrimes(expected, n);
	}

	@Test
	public void maximumArgument() {
		int n = 1000000;
		long expected = 37550402023L;
		assertSumOfPrimes(expected, n);
	}

}
