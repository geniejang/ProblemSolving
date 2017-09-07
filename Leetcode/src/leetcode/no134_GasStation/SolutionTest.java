package leetcode.no134_GasStation;

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

	private void assertCircuit(int expected, int[] gas, int[] cost) {
		int actual = solution.canCompleteCircuit(gas, cost);
		assertEquals(expected, actual);
	}

	@Test
	public void notEnoughGas() {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 1, 2, 3, 5, 5 };
		int expected = -1;
		assertCircuit(expected, gas, cost);
	}

	@Test
	public void beginAt0() {
		int[] gas = { 1, 3, 2, 4, 5 };
		int[] cost = { 1, 2, 3, 4, 5 };
		int expected = 0;
		assertCircuit(expected, gas, cost);
	}

	@Test
	public void needCircular() {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 1, 3, 2, 4, 5 };
		int expected = 2;
		assertCircuit(expected, gas, cost);
	}

}
