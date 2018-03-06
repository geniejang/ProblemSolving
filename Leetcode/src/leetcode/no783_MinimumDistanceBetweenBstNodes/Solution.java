package leetcode.no783_MinimumDistanceBetweenBstNodes;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode;

public class Solution {
	public int minDiffInBST(TreeNode root) {
		int minDiff = Integer.MAX_VALUE;
		TreeNode prev = null;
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				if (prev != null) {
					minDiff = Integer.min(minDiff, node.val - prev.val);
				}
				prev = node;
				node = node.right;
			}
		}
		return minDiff;
	}
}
