package leetcode.no236_LowestCommonAncestorOfBinaryTree;

import java.util.Stack;

import leetcode.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Stack<TreeNode> pAncestors = new Stack<TreeNode>();
		Stack<TreeNode> qAncestors = new Stack<TreeNode>();
		pushAncestors(pAncestors, p, root);
		pushAncestors(qAncestors, q, root);

		TreeNode pAncestor = null;
		TreeNode qAncestor = null;
		TreeNode lca = null;
		while (pAncestor == qAncestor) {
			lca = pAncestor;
			pAncestor = pAncestors.empty() ? null : pAncestors.pop();
			qAncestor = qAncestors.empty() ? null : qAncestors.pop();
		}

		return lca;
	}

	private boolean pushAncestors(Stack<TreeNode> ancestors, TreeNode target, TreeNode node) {
		if (node == null)
			return false;
		if (node == target || pushAncestors(ancestors, target, node.left)
				|| pushAncestors(ancestors, target, node.right)) {
			ancestors.push(node);
			return true;
		}

		return false;
	}
}
