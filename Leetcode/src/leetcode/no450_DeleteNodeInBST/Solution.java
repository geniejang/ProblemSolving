package leetcode.no450_DeleteNodeInBST;

import leetcode.TreeNode;

public class Solution {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (root.val > key) {
			root.left = deleteNode(root.left, key);
		} else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			TreeNode node = root.left;
			while (node.right != null) {
				node = node.right;
			}
			root.val = node.val;
			root.left = deleteNode(root.left, root.val);
		}
		return root;
	}

	public TreeNode deleteNodeIterative(TreeNode root, int key) {
		TreeNode parent = null;
		TreeNode node = root;
		while (node != null && node.val != key) {
			parent = node;
			node = node.val > key ? node.left : node.right;
		}
		if (parent == null) {
			return deleteNode(node);
		} else if (parent.left == node) {
			parent.left = deleteNode(node);
		} else {
			parent.right = deleteNode(node);
		}
		return root;
	}

	private TreeNode deleteNode(TreeNode node) {
		if (node == null) {
			return null;
		} else if (node.left == null) {
			return node.right;
		} else if (node.right == null) {
			return node.left;
		}
		TreeNode next = node.right;
		TreeNode parent = node;
		while (next.left != null) {
			parent = next;
			next = next.left;
		}
		node.val = next.val;
		if (parent == node) {
			parent.right = next.right;
		} else {
			parent.left = next.right;
		}
		return node;
	}
}
