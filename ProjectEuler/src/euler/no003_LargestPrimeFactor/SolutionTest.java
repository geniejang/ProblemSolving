package euler.no003_LargestPrimeFactor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertPrimeFactor(long expected, long num) {
		long actual = Solution.solve(num);
		assertEquals(expected, actual);
	}

	@Test
	public void argument10Returns5() {
		long num = 10;
		long expected = 5;
		assertPrimeFactor(expected, num);
	}

	@Test
	public void argument17Returns17() {
		long num = 17;
		long expected = 17;
		assertPrimeFactor(expected, num);
	}

	@Test
	public void argument121Returns11() {
		long num = 121;
		long expected = 11;
		assertPrimeFactor(expected, num);
	}

	@Test
	public void argumentIntMaxReturnsIntMax() {
		long num = Integer.MAX_VALUE;
		long expected = Integer.MAX_VALUE;
		assertPrimeFactor(expected, num);
	}

}
