package leetcode.no756_PyramidTransitionMatrix;

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

	private void assertTransition(boolean expected, String bottom, List<String> allowed) {
		boolean actual = solution.pyramidTransition(bottom, allowed);
		assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		String bottom = "XYZ";
		List<String> allowed = List.of("XYD", "YZE", "DEA", "FFF");
		boolean expected = true;
		assertTransition(expected, bottom, allowed);
	}

	@Test
	public void example2() {
		String bottom = "XXYX";
		List<String> allowed = List.of("XXX", "XXY", "XYX", "XYY", "YXZ");
		boolean expected = false;
		assertTransition(expected, bottom, allowed);
	}

	@Test
	public void example3() {
		String bottom = "EAGAEFF";
		List<String> allowed = List.of("BGG", "AGF", "AGD", "AGC", "AGB", "CCE", "CCD", "EGA", "CCA", "DCD", "DCB",
				"DBD", "DBF", "FFF", "FFE", "FFA", "GBF", "GBD", "GBE", "FDE", "GBC", "BED", "AEE", "DEA", "EEA", "DEG",
				"CEG", "CED", "CEB", "CEA", "GCF", "GEB", "BDB", "AFD", "AFE", "AFA", "AFC", "ECD", "DDA", "DDF", "EFG",
				"CBF", "CBD", "ACG", "ACF", "BCA", "BCB", "EFB", "ECG", "ECF", "ECE", "DGA", "DGG", "CGG", "GGE", "GGD",
				"FED", "FEA", "BBB", "ADD", "DFD", "DFF", "DFA", "CDE", "EDA", "CDA", "EDE", "FBA", "FBE", "AAE", "CAG",
				"CAF", "CAD", "DAE", "EAG", "GAE", "GAD", "GAB", "GAA", "ABD", "EBB", "CFF", "CFB", "CFC", "GFB",
				"GFA");
		boolean expected = true;
		assertTransition(expected, bottom, allowed);
	}

}
