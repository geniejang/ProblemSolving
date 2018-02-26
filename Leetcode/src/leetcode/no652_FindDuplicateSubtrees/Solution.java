package leetcode.no652_FindDuplicateSubtrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import leetcode.TreeNode;

public class Solution {
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		Map<String, List<TreeNode>> map = new HashMap<>();
		List<TreeNode> list = new ArrayList<>();
		helper(root, map);
		for (List<TreeNode> trees : map.values()) {
			if (trees.size() >= 2) {
				list.add(trees.get(0));
			}
		}
		return list;
	}

	private String helper(TreeNode node, Map<String, List<TreeNode>> map) {
		if (node == null) {
			return "[]";
		}
		String str = "[" + node.val + ", L" + helper(node.left, map) + ", R" + helper(node.right, map) + "]";
		List<TreeNode> list = map.get(str);
		if (list == null) {
			list = new ArrayList<>();
			map.put(str, list);
		}
		list.add(node);
		return str;
	}
}
