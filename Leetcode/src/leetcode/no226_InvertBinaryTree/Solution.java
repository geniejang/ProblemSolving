package leetcode.no226_InvertBinaryTree;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				TreeNode temp = node.right;
				node.right = node.left;
				node.left = temp;
				node = temp;
			}
		}
		return root;
	}
}
