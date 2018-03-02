package leetcode.no222_CountCompleteTreeNodes;

import leetcode.TreeNode;

public class Solution {
	public int countNodes(TreeNode root) {
		int depth = 0;
		for (TreeNode node = root; node != null; node = node.left) {
			depth++;
		}
		return countNodes(root, depth - 1, (1 << depth - 1) - 1);
	}

	private int countNodes(TreeNode root, int depth, int subMin) {
		if (root == null) {
			return 0;
		}
		int right = countNodes(root.right, depth - 1, subMin >> 1);
		return right + (right > subMin ? (1 << depth) : (1 + countNodes(root.left, depth - 1, subMin >> 1)));
	}
}
