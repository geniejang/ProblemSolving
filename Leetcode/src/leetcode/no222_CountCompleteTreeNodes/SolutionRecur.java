package leetcode.no222_CountCompleteTreeNodes;

import leetcode.TreeNode;

public class SolutionRecur {
	int height(TreeNode root) {
		return root == null ? 0 : 1 + height(root.left);
	}

	public int countNodes(TreeNode root) {
		int h = height(root);
		return h <= 1 ? h
				: height(root.right) == h - 1 ? (1 << h - 1) + countNodes(root.right)
						: (1 << h - 2) + countNodes(root.left);
	}
}
