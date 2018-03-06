package leetcode.no658_FindKClosestElements;

import static org.junit.Assert.*;

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

	private void assertClosets(List<Integer> expected, int[] arr, int k, int x) {
		List<Integer> actual = solution.findClosestElements(arr, k, x);
		assertEquals(expected, actual);
	}

	@Test
	public void exampleSmallFirstOnSameDifferences() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;
		int x = 3;
		List<Integer> expected = List.of(1, 2, 3, 4);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void outOfLeft() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		int x = -1;
		List<Integer> expected = List.of(1, 2, 3);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void outOfRight() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		int x = 7;
		List<Integer> expected = List.of(3, 4, 5);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void atLeft() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		int x = 1;
		List<Integer> expected = List.of(1, 2, 3);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void atRight() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		int x = 5;
		List<Integer> expected = List.of(3, 4, 5);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void inMiddle() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		int x = 3;
		List<Integer> expected = List.of(2, 3, 4);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void inMiddle2() {
		int[] arr = { 0, 0, 1, 2, 3, 3, 4, 7, 7, 8 };
		int k = 3;
		int x = 5;
		List<Integer> expected = List.of(3, 3, 4);
		assertClosets(expected, arr, k, x);
	}

	@Test
	public void inMiddle3() {
		int[] arr = { 0, 0, 0, 1, 3, 5, 6, 7, 8, 8 };
		int k = 2;
		int x = 2;
		List<Integer> expected = List.of(1, 3);
		assertClosets(expected, arr, k, x);
	}

}
