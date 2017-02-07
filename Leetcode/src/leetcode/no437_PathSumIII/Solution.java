package leetcode.no437_PathSumIII;

import java.util.Arrays;

import leetcode.TreeNode;

public class Solution {
	private int[] buffer = new int[2];

	public int pathSum(TreeNode root, int sum) {
		return find(root, 1, sum);
	}

	private int find(TreeNode node, int depth, int sum) {
		if (node == null)
			return 0;
		if (buffer.length < depth)
			buffer = Arrays.copyOf(buffer, buffer.length * 2);

		int count = 0;
		for (int i = 0; i < depth; i++) {
			buffer[i] += node.val;
			if (buffer[i] == sum)
				count++;
		}

		count += find(node.left, depth + 1, sum);
		count += find(node.right, depth + 1, sum);

		for (int i = 0; i < depth; i++) {
			buffer[i] -= node.val;
		}

		return count;
	}
}
