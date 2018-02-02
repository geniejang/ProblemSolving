package leetcode.no098_ValidateBinaryTree;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public boolean isValidBST(TreeNode root) {
		max = Long.MIN_VALUE;
		return inorder(root);
	}

	private boolean inorder(TreeNode node) {
		return node == null || (inorder(node.left) && setMax(node.val) && inorder(node.right));
	}

	private long max;

	private boolean setMax(int val) {
		if (val <= max) {
			return false;
		}
		max = val;
		return true;
	}

	public boolean isValidBSTIterative(TreeNode root) {
		List<TreeNode> stack = new ArrayList<>();
		TreeNode node = root;
		long max = Long.MIN_VALUE;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.add(0, node);
				node = node.left;
			} else {
				node = stack.remove(0);
				if (node.val <= max) {
					return false;
				}
				max = node.val;
				node = node.right;
			}
		}
		return true;
	}
}
