package leetcode.no513_FindBottomLeftTreeValue;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int leftmost = root.val;
		while (!q.isEmpty()) {
			leftmost = q.peek().val;
			int qSize = q.size();
			for (int i = 0; i < qSize; i++) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
		}
		return leftmost;
	}
}
