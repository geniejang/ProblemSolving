package leetcode;

import java.util.Comparator;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public static TreeNode from(Integer[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		return from(arr, 0);
	}

	private static TreeNode from(Integer[] arr, int index) {
		TreeNode node = null;
		if (index < arr.length && arr[index] != null) {
			node = new TreeNode(arr[index]);
			node.left = from(arr, index * 2 + 1);
			node.right = from(arr, index * 2 + 2);
		}
		return node;
	}

	@Override
	public boolean equals(Object obj) {
		if (false == obj instanceof TreeNode) {
			return false;
		}
		TreeNode node = (TreeNode) obj;
		if (val != node.val)
			return false;

		if (left == null && node.left != null)
			return false;
		else if (left != null && !left.equals(node.left))
			return false;

		if (right == null && node.right != null)
			return false;
		else if (right != null && !right.equals(node.right))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "[" + val + ", L:" + left + ", R:" + right + "]";
	}

	public static Comparator<TreeNode> COMPARATOR = new Comparator<TreeNode>() {
		@Override
		public int compare(TreeNode o1, TreeNode o2) {
			if (o1 == null && o2 == null)
				return 0;
			if (o1 == null)
				return 1;
			if (o2 == null)
				return -1;
			int diff = o1.val - o2.val;
			if (diff == 0)
				diff = compare(o1.left, o2.left);
			if (diff == 0)
				diff = compare(o1.right, o2.right);
			return diff;
		}
	};
}
