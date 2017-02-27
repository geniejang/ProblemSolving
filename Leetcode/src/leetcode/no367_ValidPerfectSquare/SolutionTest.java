package leetcode.no367_ValidPerfectSquare;

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
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertSquare(boolean expected, int num) {
		boolean actual = solution.isPerfectSquare(num);
		assertEquals(expected, actual);
	}

	@Test
	public void one() {
		assertSquare(true, 1);
	}

	@Test
	public void four() {
		assertSquare(true, 4);
	}

	@Test
	public void nine() {
		assertSquare(true, 9);
	}

	@Test
	public void sixteen() {
		assertSquare(true, 16);
	}

	@Test
	public void fourteen() {
		assertSquare(false, 14);
	}

	@Test
	public void big() {
		assertSquare(true, 808201);
	}

}
