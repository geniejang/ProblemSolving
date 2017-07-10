package euler.no002_EvenFibonacciNumbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertEvenFibonacci(long expected, long num) {
		long actual = Solution.solve(num);
		assertEquals(expected, actual);
	}

	@Test
	public void argument10Returns10() {
		long num = 10;
		long expected = 10;
		assertEvenFibonacci(expected, num);
	}

	@Test
	public void argument100Returns44() {
		long num = 100;
		long expected = 44;
		assertEvenFibonacci(expected, num);
	}

}
