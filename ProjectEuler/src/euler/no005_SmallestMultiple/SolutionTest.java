package euler.no005_SmallestMultiple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertMultiple(long expected, int n) {
		assertEquals(expected, Solution.solve(n));
		assertEquals(expected, Solution.solveWithDp(n));
	}

	@Test
	public void argument3Returns6() {
		int n = 3;
		int expected = 6;
		assertMultiple(expected, n);
	}

	@Test
	public void argument10Returns2520() {
		int n = 10;
		int expected = 2520;
		assertMultiple(expected, n);
	}

	@Test
	public void argument23ReturnsAboveIntMax() {
		int n = 23;
		long expected = 5354228880L;
		assertMultiple(expected, n);
	}

	@Test
	public void argument40Returns5342931457063200() {
		int n = 40;
		long expected = 5342931457063200L;
		assertMultiple(expected, n);
	}

}
