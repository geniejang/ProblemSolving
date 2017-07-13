package euler.no004_LargestPalindromeProduct;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	private void assertLargestPalindrome(int expected, int n) {
		int actual = Solution.solve(n);
		assertEquals(expected, actual);
	}

	@Test
	public void minimum() {
		int n = 101110;
		int expected = 101101;
		assertLargestPalindrome(expected, n);
	}

	@Test
	public void eightHundredThousands() {
		int n = 800000;
		int expected = 793397;
		assertLargestPalindrome(expected, n);
	}

}
