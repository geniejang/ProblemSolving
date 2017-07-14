package euler.no028_NumberSpiralDiagonals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertDiagonals(int expected, long num) {
		long actual = Solution.solve(num);
		assertEquals(expected, actual);
	}

	@Test
	public void argument1Returns1() {
		long num = 1;
		int expected = 1;
		assertDiagonals(expected, num);
	}

	@Test
	public void argument3Returns25() {
		long num = 3;
		int expected = 25;
		assertDiagonals(expected, num);
	}

	@Test
	public void argument5Returns101() {
		long num = 5;
		int expected = 101;
		assertDiagonals(expected, num);
	}

	@Test
	public void argumentMaximum() {
		long num = 999999999999999999L;
		int expected = 500074946;
		assertDiagonals(expected, num);
	}

}
