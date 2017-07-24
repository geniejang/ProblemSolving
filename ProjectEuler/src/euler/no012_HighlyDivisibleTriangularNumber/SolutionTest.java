package euler.no012_HighlyDivisibleTriangularNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertTriangular(int expected, int num) {
		int actual = Solution.solve(num);
		assertEquals(expected, actual);
	}

	@Test
	public void argument1Returns3() {
		int n = 1;
		int expected = 3;
		assertTriangular(expected, n);
	}

	@Test
	public void argument2Returns6() {
		int n = 2;
		int expected = 6;
		assertTriangular(expected, n);
	}

	@Test
	public void argument3Returns6() {
		int n = 3;
		int expected = 6;
		assertTriangular(expected, n);
	}

	@Test
	public void argument4Returns28() {
		int n = 4;
		int expected = 28;
		assertTriangular(expected, n);
	}
	
	@Test
	public void argument1000Returns28() {
		int n = 1000;
		int expected = 842161320;
		assertTriangular(expected, n);
	}

}
