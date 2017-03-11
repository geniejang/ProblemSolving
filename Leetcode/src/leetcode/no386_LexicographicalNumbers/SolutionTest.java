package leetcode.no386_LexicographicalNumbers;

import static org.junit.Assert.*;

import java.util.Iterator;
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

	private void assertLexicalOrderedList(int[] expecteds, List<Integer> actuals) {
		assertNotNull(actuals);
		assertEquals(expecteds.length, actuals.size());
		Iterator<Integer> iter = actuals.iterator();
		int i = 0;
		while (iter.hasNext()) {
			assertEquals(expecteds[i++], iter.next().intValue());
		}
	}

	@Test
	public void twoDigits() {
		int n = 13;
		int[] expecteds = { 1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> actuals = solution.lexicalOrder(n);
		assertLexicalOrderedList(expecteds, actuals);
	}

	@Test
	public void singleDigit() {
		int n = 3;
		int[] expecteds = { 1, 2, 3 };
		List<Integer> actuals = solution.lexicalOrder(n);
		assertLexicalOrderedList(expecteds, actuals);
	}
}
