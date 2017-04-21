package leetcode.no551_StudentAttendanceRecord1;

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

	private void assertReward(boolean expected, String s) {
		boolean actual = solution.checkRecord(s);
		assertEquals(expected, actual);
	}

	@Test
	public void rewardWithSingleAbsenceAndDoubleLates() {
		String s = "PPALLP";
		boolean expected = true;
		assertReward(expected, s);
	}

	@Test
	public void noRewardByTwoAbsence() {
		String s = "PPALLPAPPPP";
		boolean expected = false;
		assertReward(expected, s);
	}

	@Test
	public void noRewardByTripleLates() {
		String s = "PPPALLL";
		boolean expected = false;
		assertReward(expected, s);
	}

	@Test
	public void rewardWithManySplitLates() {
		String s = "PLPLPLPLLPLPLPALP";
		boolean expected = true;
		assertReward(expected, s);
	}

	@Test
	public void rewardWithPerfectPresence() {
		String s = "PPPPPPPP";
		boolean expected = true;
		assertReward(expected, s);
	}

}
