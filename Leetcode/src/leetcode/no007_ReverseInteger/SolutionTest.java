package leetcode.no007_ReverseInteger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	public void assertReverse(int expected, int x) {
		int actual = solution.reverse(x);
		assertEquals(expected, actual);
	}

	@Test
	public void reverse12() {
		assertReverse(21, 12);
	}

	@Test
	public void reverse100() {
		assertReverse(1, 100);
	}

	@Test
	public void reverse10002() {
		assertReverse(20001, 10002);
	}

	@Test
	public void reverse123() {
		assertReverse(321, 123);
	}

	@Test
	public void reverseMinus123() {
		assertReverse(-321, -123);
	}

	@Test
	public void maximumValue() {
		assertReverse(2147447412, 2147447412);
	}

	@Test
	public void reverseOverflow() {
		assertReverse(0, 1534236469);
		assertReverse(0, 2147457412);
		assertReverse(0, 2147448412);
		assertReverse(0, 2147447512);
		assertReverse(0, 2147447422);
		assertReverse(0, 2147447413);
		assertReverse(0, 2147457412);
		assertReverse(0, 2147408412);
		assertReverse(0, 2147400512);
		assertReverse(0, 2147400022);
		assertReverse(0, 2147400003);
	}

}
