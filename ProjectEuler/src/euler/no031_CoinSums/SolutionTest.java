package euler.no031_CoinSums;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertWays(int expected, int target) {
		int actual = Solution.solve(target);
		assertEquals(expected, actual);
	}

	@Test
	public void argument10Returns11() {
		int target = 10;
		int expected = 11;
		assertWays(expected, target);
	}

	@Test
	public void argument15Returns22() {
		int target = 10;
		int expected = 11;
		assertWays(expected, target);
	}

	@Test
	public void argument20Returns41() {
		int target = 10;
		int expected = 11;
		assertWays(expected, target);
	}

}
