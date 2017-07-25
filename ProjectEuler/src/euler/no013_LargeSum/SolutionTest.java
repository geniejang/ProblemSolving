package euler.no013_LargeSum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String[] nums = {
				"37107287533902102798797998220837590246510135740250",
				"46376937677490009712648124896970078050417018260538",
				"74324986199524741059474233309513058123726617309629",
				"91942213363574161572522430563301811072406154908250",
				"23067588207539346171171980310421047513778063246676"
		};
		String expected = "2728190129";
		String actual = Solution.solve(nums);
		assertEquals(expected, actual);
	}

}
