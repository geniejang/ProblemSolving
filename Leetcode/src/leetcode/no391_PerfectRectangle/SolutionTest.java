package leetcode.no391_PerfectRectangle;

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

	private void assertRectangle(boolean expected, int[][] rectangles) {
		boolean actual = solution.isRectangleCover(rectangles);
		assertEquals(expected, actual);
	}

	@Test
	public void singleCell() {
		int[][] rectangles = { { 1, 1, 2, 2 } };
		boolean expected = true;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void singleRectangle() {
		int[][] rectangles = { { 1, 1, 2, 3 } };
		boolean expected = true;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void example1() {
		int[][] rectangles = { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 }, { 1, 3, 2, 4 }, { 2, 3, 3, 4 } };
		boolean expected = true;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void example2() {
		int[][] rectangles = { { 1, 1, 2, 3 }, { 1, 3, 2, 4 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 } };
		boolean expected = false;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void example3() {
		int[][] rectangles = { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 1, 3, 2, 4 }, { 3, 2, 4, 4 } };
		boolean expected = false;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void example4() {
		int[][] rectangles = { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 1, 3, 2, 4 }, { 2, 2, 4, 4 } };
		boolean expected = false;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void duplicated() {
		int[][] rectangles = { { 1, 1, 2, 2 }, { 1, 1, 2, 2 }, { 2, 1, 3, 2 } };
		boolean expected = false;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void duplicatedpartially() {
		int[][] rectangles = { { 0, 0, 1, 1 }, { 0, 0, 2, 1 }, { 1, 0, 2, 1 }, { 0, 2, 2, 3 } };
		boolean expected = false;
		assertRectangle(expected, rectangles);
	}

	@Test
	public void negativeCoordinate() {
		int[][] rectangles = { { 0, -1, 1, 0 }, { 0, 0, 1, 1 } };
		boolean expected = true;
		assertRectangle(expected, rectangles);
	}

}
