package leetcode.no124_BinaryTreeMaximumPathSum;

import leetcode.TreeNode;

public class Solution {
	private int max;

	public int maxPathSum(TreeNode root) {
		max = Integer.MIN_VALUE;
		helper(root);
		return max;
	}

	private int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int l = Integer.max(0, helper(node.left));
		int r = Integer.max(0, helper(node.right));
		max = Integer.max(max, l + r + node.val);
		return Integer.max(l, r) + node.val;
	}
}
