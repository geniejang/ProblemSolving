package leetcode;

import java.util.Comparator;

public class TreeLinkNode {
	public int val;
	public TreeLinkNode left;
	public TreeLinkNode right;
	public TreeLinkNode next;

	public TreeLinkNode(int x) {
		val = x;
	}

	public static TreeLinkNode from(Integer[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		return from(arr, 0);
	}

	private static TreeLinkNode from(Integer[] arr, int index) {
		TreeLinkNode node = null;
		if (index < arr.length && arr[index] != null) {
			node = new TreeLinkNode(arr[index]);
			node.left = from(arr, index * 2 + 1);
			node.right = from(arr, index * 2 + 2);
		}
		return node;
	}

	@Override
	public boolean equals(Object obj) {
		if (false == obj instanceof TreeLinkNode) {
			return false;
		}
		TreeLinkNode node = (TreeLinkNode) obj;
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

		if (next == null && node.next != null)
			return false;
		else if (next != null && !next.equals(node.next))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "[" + val + ", L:" + left + ", R:" + right + ", next:" + next + "]";
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
