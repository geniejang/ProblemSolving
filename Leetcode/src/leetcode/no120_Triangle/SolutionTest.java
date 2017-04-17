package leetcode.no120_Triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

	private void assertTriangle(int expected, Integer[][] data) {
		List<List<Integer>> triangle = new LinkedList<>();
		for (Integer[] row : data) {
			triangle.add(Arrays.asList(row));
		}
		int actual = solution.minimumTotal(triangle);
		assertEquals(expected, actual);
	}

	@Test
	public void empty() {
		Integer[][] data = {};
		int expected = 0;
		assertTriangle(expected, data);
	}

	@Test
	public void triangle() {
		Integer[][] data = {
				{ 2 },
				{ 3, 4 },
				{ 6, 5, 7 },
				{ 4, 1, 8, 3 }
		};
		int expected = 11;
		assertTriangle(expected, data);
	}

}
