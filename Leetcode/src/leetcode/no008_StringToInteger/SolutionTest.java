package leetcode.no008_StringToInteger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	public void assertMyAtoi(int expected, String str) {
		int actual = solution.myAtoi(str);
		assertEquals(expected, actual);
	}

	@Test
	public void singleDigit() {
		assertMyAtoi(1, "1");
		assertMyAtoi(2, "2");
		assertMyAtoi(3, "3");
		assertMyAtoi(4, "4");
		assertMyAtoi(5, "5");
		assertMyAtoi(6, "6");
		assertMyAtoi(7, "7");
		assertMyAtoi(8, "8");
		assertMyAtoi(9, "9");
	}

	@Test
	public void multipleDigis() {
		assertMyAtoi(10, "10");
		assertMyAtoi(19, "19");
		assertMyAtoi(45, "45");
		assertMyAtoi(99, "99");
		assertMyAtoi(990, "990");
		assertMyAtoi(1000, "1000");
	}

	@Test
	public void integerMax() {
		assertMyAtoi(Integer.MAX_VALUE, "" + Integer.MAX_VALUE);
	}

	@Test
	public void minusNumbers() {
		assertMyAtoi(-1, "-1");
		assertMyAtoi(-10, "-10");
		assertMyAtoi(-911, "-911");
		assertMyAtoi(-3336132, "-3336132");
		assertMyAtoi(-2714, "-2714");
	}

	@Test
	public void plusNumbers() {
		assertMyAtoi(+1, "+1");
	}

	@Test
	public void integerMin() {
		assertMyAtoi(Integer.MIN_VALUE, "" + Integer.MIN_VALUE);
	}

	@Test
	public void startsWithSpaces() {
		assertMyAtoi(3, " 3");
		assertMyAtoi(397, "   397");
		assertMyAtoi(-223, "      -223");
	}

	@Test
	public void emptyInput() {
		assertMyAtoi(0, "");
	}

	@Test
	public void spacesOnly() {
		assertMyAtoi(0, "    ");
	}

	@Test
	public void invalidInput() {
		assertMyAtoi(0, "A");
		assertMyAtoi(0, "{");
		assertMyAtoi(0, "    bA");
		assertMyAtoi(0, "    !123");
		assertMyAtoi(0, "    -a123");
		assertMyAtoi(0, "    -a123");
	}

	@Test
	public void ignoreTails() {
		assertMyAtoi(-12, "  -0012a42");
	}

	@Test
	public void integerMaxOnOverflow() {
		assertMyAtoi(Integer.MAX_VALUE, "" + Long.MAX_VALUE);
		assertMyAtoi(Integer.MAX_VALUE, "2147483648");
	}

	@Test
	public void integerMinOnOverflow() {
		assertMyAtoi(Integer.MIN_VALUE, "" + Long.MIN_VALUE);
		assertMyAtoi(Integer.MIN_VALUE, "-2147483649");
	}

}
