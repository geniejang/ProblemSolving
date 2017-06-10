package leetcode.no609_FindDuplicateFileInSystem;

import static org.junit.Assert.*;

import java.util.Arrays;
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

	@Test
	public void test() {
		String[] paths = { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)",
				"root 4.txt(efgh)" };
		String[][] expecteds = { { "root/a/2.txt", "root/c/d/4.txt", "root/4.txt" },
				{ "root/a/1.txt", "root/c/3.txt" } };
		List<List<String>> actuals = solution.findDuplicate(paths);
		assertNotNull(actuals);
		assertEquals(expecteds.length, actuals.size());
		for (int i = 0; i < expecteds.length; i++) {
			assertEquals(Arrays.asList(expecteds[i]), actuals.get(i));
		}
	}

}
