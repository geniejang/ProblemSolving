package leetcode.no449_SerializeAndDeserializeBST;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.TreeNode;

public class CodecWithBFS {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		StringBuffer sb = new StringBuffer();
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node == null) {
				sb.append("null").append(",");
			} else {
				sb.append(node.val).append(",");
				q.offer(node.left);
				q.offer(node.right);
			}
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] vals = data.split(",");
		TreeNode root = parse(vals[0]);
		int idx = 1;
		Queue<TreeNode> lv = new LinkedList<>();
		if (root != null) {
			lv.add(root);
		}
		while (!lv.isEmpty()) {
			for (int i = lv.size(); i > 0; i--) {
				TreeNode node = lv.poll();
				node.left = parse(vals[idx++]);
				if (node.left != null) {
					lv.offer(node.left);
				}
				node.right = parse(vals[idx++]);
				if (node.right != null) {
					lv.offer(node.right);
				}
			}
		}
		return root;
	}

	private TreeNode parse(String val) {
		return val.equals("null") ? null : new TreeNode(Integer.valueOf(val));
	}
}
