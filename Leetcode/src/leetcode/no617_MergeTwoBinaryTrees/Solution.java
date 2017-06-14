package leetcode.no617_MergeTwoBinaryTrees;

import leetcode.TreeNode;

public class Solution {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null || t2 == null) {
			return t1 != null ? t1 : t2;
		}
		TreeNode node = new TreeNode(t1.val + t2.val);
		node.left = mergeTrees(t1.left, t2.left);
		node.right = mergeTrees(t1.right, t2.right);
		return node;
	}
}
