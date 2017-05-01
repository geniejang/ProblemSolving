package leetcode.no563_BinaryTreeTilt;

import leetcode.TreeNode;

public class Solution {
	private int tilt = 0;

	public int findTilt(TreeNode root) {
		traverse(root);
		return tilt;
	}

	public int traverse(TreeNode node) {
		if (node == null)
			return 0;
		int leftSum = traverse(node.left);
		int rightSum = traverse(node.right);
		tilt += Math.abs(leftSum - rightSum);
		return node.val + leftSum + rightSum;
	}
}
