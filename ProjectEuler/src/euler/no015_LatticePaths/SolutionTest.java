package euler.no015_LatticePaths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertPaths(int expected, int n, int m) {
		int actual = Solution.solve(n, m);
		assertEquals(expected, actual);
	}

	@Test
	public void argument2And2Returns6() {
		int n = 2;
		int m = 2;
		int expected = 6;
		assertPaths(expected, n, m);
	}

	@Test
	public void argument2And3Returns10() {
		int n = 2;
		int m = 3;
		int expected = 10;
		assertPaths(expected, n, m);
	}

}
