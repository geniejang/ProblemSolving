package leetcode.no230_KthSmallestElementInBST;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		List<TreeNode> stack = new ArrayList<>();
		TreeNode node = root;
		while (k > 0) { // 1 <= k <= (BST's total elements)
			while (node != null) {
				stack.add(node);
				node = node.left;
			}
			node = stack.remove(stack.size() - 1);
			if (--k == 0) {
				return node.val;
			}
			node = node.right;
		}
		return Integer.MIN_VALUE;
	}
}
