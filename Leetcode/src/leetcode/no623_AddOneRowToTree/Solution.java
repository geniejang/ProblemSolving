package leetcode.no623_AddOneRowToTree;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if (d == 1) {
			TreeNode newRoot = new TreeNode(v);
			newRoot.left = root;
			return newRoot;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		for (int i = 2; i < d; i++) {
			int len = q.size();
			while (len-- > 0) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
		}
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			TreeNode left = new TreeNode(v);
			left.left = node.left;
			node.left = left;
			TreeNode right = new TreeNode(v);
			right.right = node.right;
			node.right = right;
		}
		return root;
	}
}
