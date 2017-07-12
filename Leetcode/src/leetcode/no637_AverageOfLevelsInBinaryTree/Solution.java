package leetcode.no637_AverageOfLevelsInBinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> avgs = new LinkedList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			double sum = 0;
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				sum += node.val;
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
			avgs.add(sum / size);
		}
		return avgs;
	}
}
