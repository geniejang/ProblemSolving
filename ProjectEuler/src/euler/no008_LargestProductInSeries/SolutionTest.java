package euler.no008_LargestProductInSeries;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertProduct(int expected, String num, int n, int k) {
		int actual = Solution.solve(num, n, k);
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		int n = 10;
		int k = 5;
		String num = "3675356291";
		int expected = 3150;
		assertProduct(expected, num, n, k);
	}

	@Test
	public void zeroesMake0() {
		int n = 10;
		int k = 5;
		String num = "2709360626";
		int expected = 0;
		assertProduct(expected, num, n, k);
	}

}
