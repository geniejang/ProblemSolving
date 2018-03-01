package leetcode.no129_SumRootToLeafNumbers;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public int sumNumbersIter(TreeNode root) {
		Queue<TreeNode> tq = new LinkedList<>();
		Queue<Integer> nq = new LinkedList<>();
		if (root != null) {
			tq.offer(root);
			nq.offer(0);
		}
		int sum = 0;
		while (!tq.isEmpty()) {
			for (int n = tq.size(); n > 0; n--) {
				TreeNode node = tq.poll();
				int num = nq.poll() * 10 + node.val;
				if (node.left == null && node.right == null) {
					sum += num;
				} else {
					if (node.left != null) {
						tq.offer(node.left);
						nq.offer(num);
					}
					if (node.right != null) {
						tq.offer(node.right);
						nq.offer(num);
					}
				}
			}
		}
		return sum;
	}

	public int sumNumbersRecur(TreeNode root) {
		return root == null ? 0 : sumNumbers(root, 0);
	}

	private int sumNumbers(TreeNode node, int val) {
		if (node == null) {
			return 0;
		}
		int num = val * 10 + node.val;
		return node.left == null && node.right == null ? num
				: (sumNumbers(node.left, num) + sumNumbers(node.right, num));
	}
}
