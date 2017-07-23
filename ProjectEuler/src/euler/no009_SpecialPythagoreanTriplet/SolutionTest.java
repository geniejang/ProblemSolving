package euler.no009_SpecialPythagoreanTriplet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertTriplet(int expected, int n) {
		int actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void argument12Returns60By3_4_5() {
		int n = 12;
		int expected = 60;
		assertTriplet(expected, n);
	}

	@Test
	public void argument4ReturnsMinus1() {
		int n = 4;
		int expected = -1;
		assertTriplet(expected, n);
	}

}
