package leetcode.no199_BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> rights = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		if (root != null) {
			q.offer(root);
		}
		while (!q.isEmpty()) {
			rights.add(q.peek().val);
			for (int i = q.size(); i > 0; i--) {
				TreeNode node = q.poll();
				if (node.right != null) {
					q.offer(node.right);
				}
				if (node.left != null) {
					q.offer(node.left);
				}
			}
		}
		return rights;
	}
}
