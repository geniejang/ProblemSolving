package leetcode.no515_FindLargestValueInEachTreeRow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root != null)
			q.add(root);
		for (int size = q.size(); size > 0; size = q.size()) {
			int largest = Integer.MIN_VALUE;
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				largest = Math.max(largest, node.val);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}
			list.add(largest);
		}
		return list;
	}
}
