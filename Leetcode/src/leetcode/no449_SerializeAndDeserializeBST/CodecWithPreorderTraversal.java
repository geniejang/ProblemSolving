package leetcode.no449_SerializeAndDeserializeBST;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.TreeNode;

public class CodecWithPreorderTraversal {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode node = root;
		StringBuffer sb = new StringBuffer();
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				sb.append(node.val).append(",");
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				node = node.right;
			}
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data == null || data.length() == 0) {
			return null;
		}
		String[] vals = data.split(",");
		TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
		Deque<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		TreeNode node = stack.peek();
		int idx = 1;
		while (idx < vals.length) {
			TreeNode next = new TreeNode(Integer.valueOf(vals[idx++]));
			if (next.val < node.val) {
				node.left = next;
			} else {
				while (!stack.isEmpty() && stack.peek().val < next.val) {
					node = stack.pop();
				}
				node.right = next;
			}
			stack.push(next);
			node = next;
		}
		return root;
	}
}
