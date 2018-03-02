package leetcode.no654_MaximumBinaryTree;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode;

public class Solution {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		Deque<TreeNode> stack = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			TreeNode node = new TreeNode(nums[i]);
			while (!stack.isEmpty() && stack.peek().val < node.val) {
				node.left = stack.pop();
			}
			if (!stack.isEmpty()) {
				stack.peek().right = node;
			}
			stack.push(node);
		}
		TreeNode root = null;
		while (!stack.isEmpty()) {
			root = stack.pop();
		}
		return root;
	}
}
