package leetcode.no12_IntegerToRoman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertIntegerToRoman(String expected, int num) {
		String actual = solution.intToRoman(num);
		assertTrue(expected.equals(actual));
	}

	@Test
	public void ones() {
		assertIntegerToRoman("I", 1);
		assertIntegerToRoman("II", 2);
		assertIntegerToRoman("III", 3);
		assertIntegerToRoman("IV", 4);
		assertIntegerToRoman("V", 5);
		assertIntegerToRoman("VI", 6);
		assertIntegerToRoman("VII", 7);
		assertIntegerToRoman("VIII", 8);
		assertIntegerToRoman("IX", 9);
	}

	@Test
	public void tens() {
		assertIntegerToRoman("X", 10);
		assertIntegerToRoman("XX", 20);
		assertIntegerToRoman("XXX", 30);
		assertIntegerToRoman("XL", 40);
		assertIntegerToRoman("L", 50);
		assertIntegerToRoman("LX", 60);
		assertIntegerToRoman("LXX", 70);
		assertIntegerToRoman("LXXX", 80);
		assertIntegerToRoman("XC", 90);
	}

	@Test
	public void hundreds() {
		assertIntegerToRoman("C", 100);
		assertIntegerToRoman("CC", 200);
		assertIntegerToRoman("CCC", 300);
		assertIntegerToRoman("CD", 400);
		assertIntegerToRoman("D", 500);
		assertIntegerToRoman("DC", 600);
		assertIntegerToRoman("DCC", 700);
		assertIntegerToRoman("DCCC", 800);
		assertIntegerToRoman("CM", 900);
	}

	@Test
	public void thousands() {
		assertIntegerToRoman("M", 1000);
		assertIntegerToRoman("MM", 2000);
		assertIntegerToRoman("MMM", 3000);
	}

	@Test
	public void maximum() {
		assertIntegerToRoman("MMMCMXCIX", 3999);
	}

	@Test
	public void combined() {
		assertIntegerToRoman("XII", 12);
		assertIntegerToRoman("XIV", 14);
		assertIntegerToRoman("XCIX", 99);
	}
}
