package euler.no001_MultiplesOf3And5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertSum(long expected, int num) {
		long actual = Solution.solve(num);
		assertEquals(expected, actual);
	}

	@Test
	public void argument10Returns23() {
		int num = 10;
		long expected = 23;
		assertSum(expected, num);
	}

	@Test
	public void argument100Returns2318() {
		int num = 100;
		long expected = 2318;
		assertSum(expected, num);
	}

}
