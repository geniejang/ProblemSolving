package euler.no014_LongestCollatzSequence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertCollatz(int expected, int n) {
		int actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void argument10Returns9() {
		int n = 10;
		int expected = 9;
		assertCollatz(expected, n);
	}

	@Test
	public void argument15Returns9() {
		int n = 15;
		int expected = 9;
		assertCollatz(expected, n);
	}

	@Test
	public void argument20Returns19() {
		int n = 20;
		int expected = 19;
		assertCollatz(expected, n);
	}

	@Test
	public void maximumValue() {
		int n = 5000000;
		int expected = 3732423;
		assertCollatz(expected, n);
	}

}
