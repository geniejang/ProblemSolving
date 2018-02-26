package leetcode.no662_MaximumWidthOfBinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

import leetcode.TreeNode;

public class Solution {
	public int widthOfBinaryTree(TreeNode root) {
		/**
		 * The two queues could be combined into one by using Map.Entry<K, V>
		 * with AbstractMap.SimpleEntry(K, V); a constructor or Map.entry(K, V); a static factory method.
		 * But, leetcode looks doesn't support any of them.
		 */
		Deque<TreeNode> nodeQ = new LinkedList<>();
		Deque<Integer> idxQ = new LinkedList<>();
		int maxWidth = 0;
		if (root != null) {
			nodeQ.offer(root);
			idxQ.offer(0);
		}
		while (!nodeQ.isEmpty()) {
			maxWidth = Integer.max(maxWidth, idxQ.peekLast() - idxQ.peekFirst() + 1);
			for (int i = nodeQ.size(); i > 0; i--) {
				TreeNode node = nodeQ.poll();
				int idx = idxQ.poll();
				if (node.left != null) {
					nodeQ.offer(node.left);
					idxQ.offer(idx * 2 + 1);
				}
				if (node.right != null) {
					nodeQ.offer(node.right);
					idxQ.offer(idx * 2 + 2);
				}
			}
		}
		return maxWidth;
	}

	public int widthOfBinaryTreeJava9(TreeNode root) {
		Deque<Map.Entry<TreeNode, Integer>> q = new LinkedList<>();
		int maxWidth = 0;
		if (root != null) {
			q.offer(Map.entry(root, 0));
		}
		while (!q.isEmpty()) {
			maxWidth = Integer.max(maxWidth, q.peekLast().getValue() - q.peekFirst().getValue() + 1);
			for (int i = q.size(); i > 0; i--) {
				Map.Entry<TreeNode, Integer> e = q.poll();
				TreeNode node = e.getKey();
				int idx = e.getValue();
				if (node.left != null) {
					q.offer(Map.entry(node.left, idx * 2 + 1));
				}
				if (node.right != null) {
					q.offer(Map.entry(node.right, idx * 2 + 2));
				}
			}
		}
		return maxWidth;

	}
}
