package leetcode.no125_ValidPalindrome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void trueCase() {
		String s = "A man, a plan, a canal: Panama";
		assertTrue(solution.isPalindrome(s));
	}

	@Test
	public void falseCase() {
		String s = "rase a car";
		assertFalse(solution.isPalindrome(s));
	}

	@Test
	public void noCharacters() {
		String s = ".,";
		assertTrue(solution.isPalindrome(s));
	}

	@Test
	public void twoCharacters() {
		String s = "ab";
		assertFalse(solution.isPalindrome(s));
	}

}
