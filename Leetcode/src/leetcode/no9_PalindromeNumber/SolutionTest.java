package leetcode.no9_PalindromeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	@Test
	public void singleDigit() {
		assertEquals(true, solution.isPalindrome(0));
		assertEquals(true, solution.isPalindrome(1));
		assertEquals(true, solution.isPalindrome(2));
		assertEquals(true, solution.isPalindrome(3));
		assertEquals(true, solution.isPalindrome(4));
		assertEquals(true, solution.isPalindrome(5));
		assertEquals(true, solution.isPalindrome(6));
		assertEquals(true, solution.isPalindrome(7));
		assertEquals(true, solution.isPalindrome(8));
		assertEquals(true, solution.isPalindrome(9));
	}

	@Test
	public void twoDigitPalindrome() {
		assertEquals(true, solution.isPalindrome(11));
	}

	@Test
	public void twoDigitNonPalindrome() {
		assertEquals(false, solution.isPalindrome(12));
	}

	@Test
	public void palindromes() {
		assertEquals(true, solution.isPalindrome(101));
		assertEquals(true, solution.isPalindrome(2002));
		assertEquals(true, solution.isPalindrome(21312));
		assertEquals(true, solution.isPalindrome(123321));
		assertEquals(true, solution.isPalindrome(1234321));
		assertEquals(true, solution.isPalindrome(123454321));
		assertEquals(true, solution.isPalindrome(1234554321));
	}

	@Test
	public void nonPalindromes() {
		assertEquals(false, solution.isPalindrome(10));
		assertEquals(false, solution.isPalindrome(2012));
		assertEquals(false, solution.isPalindrome(21311));
		assertEquals(false, solution.isPalindrome(111222));
		assertEquals(false, solution.isPalindrome(1112223));
		assertEquals(false, solution.isPalindrome(44334433));
	}

	@Test
	public void minus() {
		assertEquals(false, solution.isPalindrome(-2147447412));
	}
}
