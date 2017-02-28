package leetcode.no374_GuessNumberHigherOrLower;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = Mockito.spy(new Solution());
	}

	@Test
	public void initiated() {
		assertNotNull(solution);
	}

	private void assertNumber(int expected, int n) {
		when(solution.guess(expected)).thenReturn(0);
		when(solution.guess(intThat(num -> num < expected))).thenReturn(1);
		when(solution.guess(intThat(num -> num > expected))).thenReturn(-1);

		int actual = solution.guessNumber(n);
		assertEquals(expected, actual);
	}

	@Test
	public void sixInTen() {
		int expected = 6;
		int n = 10;
		assertNumber(expected, n);
	}

}
