package leetcode.no449_SerializeAndDeserializeBST;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import leetcode.TreeNode;

public class CodecWithMap {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		Queue<TreeNode> tq = new LinkedList<>();
		Queue<Integer> iq = new LinkedList<>();
		if (root != null) {
			tq.offer(root);
			iq.offer(0);
		}
		StringBuffer sb = new StringBuffer();
		while (!tq.isEmpty()) {
			TreeNode node = tq.poll();
			int idx = iq.poll();
			sb.append(idx).append(",").append(node.val).append(",");
			if (node.left != null) {
				tq.offer(node.left);
				iq.offer(idx * 2 + 1);
			}
			if (node.right != null) {
				tq.offer(node.right);
				iq.offer(idx * 2 + 2);
			}
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] pairs = data.split(",");
		Map<Integer, TreeNode> map = new HashMap<>();
		for (int i = 1; i < pairs.length; i += 2) {
			map.put(Integer.valueOf(pairs[i - 1]), new TreeNode(Integer.valueOf(pairs[i])));
		}
		for (Map.Entry<Integer, TreeNode> e : map.entrySet()) {
			TreeNode node = e.getValue();
			node.left = map.get(e.getKey() * 2 + 1);
			node.right = map.get(e.getKey() * 2 + 2);
		}
		return map.get(0);
	}
}
