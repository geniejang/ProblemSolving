package leetcode.no103_BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		List<TreeNode> level = new LinkedList<>();
		if (root != null) {
			level.add(root);
		}
		while (!level.isEmpty()) {
			int size = level.size();
			List<Integer> values = new ArrayList<>(size);
			for (int i = 0; i < size; i++) {
				values.add(level.get((list.size() & 1) == 0 ? i : (size - 1 - i)).val);
			}
			list.add(values);
			for (int i = size; i > 0; i--) {
				TreeNode node = level.remove(0);
				if (node.left != null) {
					level.add(node.left);
				}
				if (node.right != null) {
					level.add(node.right);
				}
			}
		}
		return list;
	}
}
