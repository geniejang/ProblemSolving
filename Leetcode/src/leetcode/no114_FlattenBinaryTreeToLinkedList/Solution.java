package leetcode.no114_FlattenBinaryTreeToLinkedList;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode;

public class Solution {
	public void flatten(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		if (root != null) {
			stack.push(root);
		}
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
				node.left = null;
			}
			node.right = stack.peek(); // An empty Deque instance returns null on peek(). No need to check isEmpty()
		}
	}

	public void flatten2(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode node = root;
		while (node != null) {
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				node.right = node.left;
				node.left = null;
			} else if (!stack.isEmpty()) {
				node.right = stack.pop();
			}
			node = node.right;
		}
	}
}
