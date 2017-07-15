package euler.no006_SumSquareDifference;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertDifference(long expected, int n) {
		long actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void argument3Returns22() {
		int n = 3;
		int expected = 22;
		assertDifference(expected, n);
	}

	@Test
	public void argument10Returns2640() {
		int n = 10;
		int expected = 2640;
		assertDifference(expected, n);
	}

	@Test
	public void argumentMax() {
		int n = 10000;
		long expected = 2500166641665000L;
		assertDifference(expected, n);
	}

}
