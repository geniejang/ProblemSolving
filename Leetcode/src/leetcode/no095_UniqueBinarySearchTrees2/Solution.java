package leetcode.no095_UniqueBinarySearchTrees2;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public List<TreeNode> generateTrees(int n) {
		return generateTreesBetween(1, n);
	}

	private List<TreeNode> generateTreesBetween(int small, int big) {
		List<TreeNode> list = new ArrayList<>();
		for (int rootVal = small; rootVal <= big; rootVal++) {
			List<TreeNode> lefts = generateTreesBetween(small, rootVal - 1);
			if (lefts.isEmpty())
				lefts.add(null);
			List<TreeNode> rights = generateTreesBetween(rootVal + 1, big);
			if (rights.isEmpty())
				rights.add(null);
			for (TreeNode left : lefts) {
				for (TreeNode right : rights) {
					TreeNode root = new TreeNode(rootVal);
					root.left = left;
					root.right = right;
					list.add(root);
				}
			}
		}
		return list;
	}
}
