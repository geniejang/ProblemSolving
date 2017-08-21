package leetcode.no144_BinaryTreePreorderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import leetcode.TreeNode;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return list;
	}
}
