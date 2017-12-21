package leetcode.no257_BinaryTreePaths;

import java.util.LinkedList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new LinkedList<>();
		if (root != null) {
			for (String subpath : binaryTreePaths(root.left)) {
				paths.add(root.val + "->" + subpath);
			}
			for (String subpath : binaryTreePaths(root.right)) {
				paths.add(root.val + "->" + subpath);
			}
			if (paths.isEmpty()) {
				paths.add("" + root.val);
			}
		}
		return paths;
	}
}
