package leetcode.no725_SplitLinkedListInParts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import leetcode.ListNode;

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

	private void assertParts(Integer[][] arrExpecteds, ListNode root, int k) {
		ListNode[] expecteds = new ListNode[arrExpecteds.length];
		for (int i = 0; i < expecteds.length; i++) {
			expecteds[i] = ListNode.from(arrExpecteds[i]);
		}
		ListNode[] actuals = solution.splitListToParts(root, k);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void insufficient() {
		ListNode root = ListNode.from(1, 2, 3);
		int k = 5;
		Integer[][] expecteds = { { 1 }, { 2 }, { 3 }, null, null };
		assertParts(expecteds, root, k);
	}

	@Test
	public void fit() {
		ListNode root = ListNode.from(1, 2, 3);
		int k = 3;
		Integer[][] expecteds = { { 1 }, { 2 }, { 3 } };
		assertParts(expecteds, root, k);
	}

	@Test
	public void remains() {
		ListNode root = ListNode.from(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int k = 3;
		Integer[][] expecteds = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
		assertParts(expecteds, root, k);
	}

}
