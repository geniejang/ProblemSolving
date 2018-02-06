package leetcode.no173_BinarySearchTreeIterator;

import java.util.Stack;

import leetcode.TreeNode;

public class BSTIterator {
	private Stack<TreeNode> stack;
	private TreeNode node;

	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		node = root;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.empty() || node != null;
	}

	/** @return the next smallest number */
	public int next() {
		int val = Integer.MIN_VALUE;
		if (hasNext()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			val = node.val;
			node = node.right;
		}
		return val;
	}
}
