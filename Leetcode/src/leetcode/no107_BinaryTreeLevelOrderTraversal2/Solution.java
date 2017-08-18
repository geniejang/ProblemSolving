package leetcode.no107_BinaryTreeLevelOrderTraversal2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.add(root);
		while (!nodes.isEmpty()) {
			List<Integer> levelList = new LinkedList<>();
			for (int i = nodes.size(); i > 0; i--) {
				TreeNode node = nodes.poll();
				levelList.add(node.val);
				if (node.left != null) {
					nodes.add(node.left);
				}
				if (node.right != null) {
					nodes.add(node.right);
				}
			}
			list.add(0, levelList);
		}
		return list;
	}
}
