package leetcode.no116_PopulatingNextRightPointersInEachNode;

import leetcode.TreeLinkNode;

public class Solution {
	public void connectRecur(TreeLinkNode root) {
		if (root == null || root.left == null) {
			return;
		}
		root.left.next = root.right;
		if (root.next != null) {
			root.right.next = root.next.left;
		}
		connectRecur(root.left);
		connectRecur(root.right);
	}

	public void connectBFS(TreeLinkNode root) {
		for (TreeLinkNode start = root; start != null && start.left != null; start = start.left) {
			for (TreeLinkNode node = start; node != null; node = node.next) {
				node.left.next = node.right;
				if (node.next != null) {
					node.right.next = node.next.left;
				}
			}
		}
	}
}
