package leetcode.no556_NextGreaterElement3;

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

	private void assertNext(int n, int expected) {
		for (int i = 0; i < 1000000; i++) {
		int actual = solution.nextGreaterElementWithPrimitives(n);
		assertEquals(expected, actual);
		}
	}

	@Test
	public void twelve() {
		int n = 12;
		int expected = 21;
		assertNext(n, expected);
	}

	@Test
	public void twentyOne() {
		int n = 21;
		int expected = -1;
		assertNext(n, expected);
	}

	@Test
	public void triple321() {
		int n = 321321321;
		int expected = 321322113;
		assertNext(n, expected);
	}

	@Test
	public void overflow() {
		int n = 1999999999;
		int expected = -1;
		assertNext(n, expected);
	}

	@Test
	public void random() {
		int n = 12443322;
		int expected = 13222344;
		assertNext(n, expected);
	}

}
