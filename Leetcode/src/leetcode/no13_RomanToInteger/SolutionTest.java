package leetcode.no13_RomanToInteger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertRomanToInt(int expected, String s) {
		int actual = solution.romanToInt(s);
		assertEquals(expected, actual);
	}

	@Test
	public void units() {
		assertRomanToInt(1, "I");
		assertRomanToInt(2, "II");
		assertRomanToInt(3, "III");
		assertRomanToInt(4, "IV");
		assertRomanToInt(5, "V");
		assertRomanToInt(6, "VI");
		assertRomanToInt(7, "VII");
		assertRomanToInt(8, "VIII");
		assertRomanToInt(9, "IX");
	}

	@Test
	public void tens() {
		assertRomanToInt(10, "X");
		assertRomanToInt(20, "XX");
		assertRomanToInt(30, "XXX");
		assertRomanToInt(40, "XL");
		assertRomanToInt(50, "L");
		assertRomanToInt(60, "LX");
		assertRomanToInt(70, "LXX");
		assertRomanToInt(80, "LXXX");
		assertRomanToInt(90, "XC");
	}

	@Test
	public void hundreds() {
		assertRomanToInt(100, "C");
		assertRomanToInt(200, "CC");
		assertRomanToInt(300, "CCC");
		assertRomanToInt(400, "CD");
		assertRomanToInt(500, "D");
		assertRomanToInt(600, "DC");
		assertRomanToInt(700, "DCC");
		assertRomanToInt(800, "DCCC");
		assertRomanToInt(900, "CM");
	}

	@Test
	public void thousands() {
		assertRomanToInt(1000, "M");
		assertRomanToInt(2000, "MM");
		assertRomanToInt(3000, "MMM");
	}

	@Test
	public void maximum() {
		assertRomanToInt(3999, "MMMCMXCIX");
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalInput() {
		assertRomanToInt(0, "F");
	}
}
