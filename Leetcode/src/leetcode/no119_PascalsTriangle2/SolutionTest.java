package leetcode.no119_PascalsTriangle2;

import static org.junit.Assert.*;

import java.util.List;

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

	private void assertRow(Integer[] expecteds, int rowIndex) {
		List<Integer> actuals = solution.getRow(rowIndex);
		assertNotNull(actuals);
		assertArrayEquals(expecteds, actuals.toArray());
	}

	@Test
	public void zero() {
		assertRow(new Integer[] { 1 }, 0);
	}

	@Test
	public void one() {
		assertRow(new Integer[] { 1, 1 }, 1);
	}

	@Test
	public void two() {
		assertRow(new Integer[] { 1, 2, 1 }, 2);
	}

	@Test
	public void three() {
		assertRow(new Integer[] { 1, 3, 3, 1 }, 3);
	}

}
