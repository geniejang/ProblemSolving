package leetcode.no660_Remove9;

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

	private void assertNewInteger(int expected, int n) {
		int actual = solution.newInteger(n);
		assertEquals(expected, actual);
	}

	@Test
	public void one() {
		int n = 1;
		int expected = 1;
		assertNewInteger(expected, n);
	}

	@Test
	public void noShiftOn8() {
		int n = 8;
		int expected = 8;
		assertNewInteger(expected, n);
	}

	@Test
	public void oneShiftOn9() {
		int n = 9;
		int expected = 10;
		assertNewInteger(expected, n);
	}

	@Test
	public void eightShiftsOn80() {
		int n = 80;
		int expected = 88;
		assertNewInteger(expected, n);
	}

	@Test
	public void nineteenShiftsOn81() {
		int n = 81;
		int expected = 100;
		assertNewInteger(expected, n);
	}

}
