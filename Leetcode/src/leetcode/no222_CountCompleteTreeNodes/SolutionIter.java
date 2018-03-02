package leetcode.no222_CountCompleteTreeNodes;

import leetcode.TreeNode;

public class SolutionIter {
	int height(TreeNode root) {
		int h = 0;
		while (root != null) {
			root = root.left;
			h++;
		}
		return h;
	}

	public int countNodes(TreeNode root) {
		int h = height(root);
		if (h <= 1) {
			return h;
		}
		int cnt = 0;
		while (h-- > 0) {
			if (height(root.right) == h) {
				cnt += 1 << h;
				root = root.right;
			} else {
				cnt += 1 << h - 1;
				root = root.left;
			}
		}
		return cnt;
	}
}
