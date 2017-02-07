package leetcode.no263_UglyNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	private void assertIsUgly(boolean expected, int num) {
		boolean actual = solution.isUgly(2);
		assertEquals(expected, actual);
	}

	@Test
	public void multiplesOfTwo() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i << 1);
		}
	}

	@Test
	public void multiplesOfThree() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 3);
		}
	}

	@Test
	public void multiplesOfFive() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 5);
		}
	}

	@Test
	public void multiplesOfTwoAndThree() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 2 * 3);
		}
	}

	@Test
	public void multiplesOfTwoAndFive() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 2 * 5);
		}
	}

	@Test
	public void multiplesOfThreeAndFive() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 3 * 5);
		}
	}

	@Test
	public void multiplesOfTwoAndThreeAndFive() {
		for (int i = 1; i < 1024; i++) {
			assertIsUgly(true, i * 2 * 3 * 5);
		}
	}

	@Test
	public void notUgly() {
		assertIsUgly(true, 7);
	}

}
