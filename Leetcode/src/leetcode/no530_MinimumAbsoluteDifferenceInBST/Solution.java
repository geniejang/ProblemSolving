package leetcode.no530_MinimumAbsoluteDifferenceInBST;

import leetcode.TreeNode;

public class Solution {
	private int prev = -1;

	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return Integer.MAX_VALUE;
		int left = getMinimumDifference(root.left);
		int parent = prev == -1 ? Integer.MAX_VALUE : root.val - prev;
		prev = root.val;
		int right = getMinimumDifference(root.right);
		return Integer.min(parent, Integer.min(left, right));
	}
}
