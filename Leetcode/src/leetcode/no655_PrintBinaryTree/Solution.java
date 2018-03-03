package leetcode.no655_PrintBinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class Solution {
	public List<List<String>> printTree(TreeNode root) {
		List<List<String>> list = new ArrayList<>();
		List<List<String>> lefts = root.left == null ? Collections.emptyList() : printTree(root.left);
		List<List<String>> rights = root.right == null ? Collections.emptyList() : printTree(root.right);
		int subLevels = Integer.max(lefts.size(), rights.size());
		int subLen = (1 << subLevels) - 1;
		List<String> curLv = new LinkedList<>();
		curLv.add(String.valueOf(root.val));
		list.add(curLv);
		for (int i = subLen; i > 0; i--) {
			curLv.add(0, "");
			curLv.add("");
		}
		for (int subLv = 0; subLv < subLevels; subLv++) {
			List<String> lLv = subLv < lefts.size() ? lefts.get(subLv) : new LinkedList<>();
			List<String> rLv = subLv < rights.size() ? rights.get(subLv) : new LinkedList<>();
			List<String> fewer = lLv.size() < rLv.size() ? lLv : rLv;
			if (fewer.isEmpty()) {
				fewer.add("");
			}
			while (fewer.size() < subLen) {
				for (int i = fewer.size(); i >= 0; i--) {
					fewer.add(i, "");
				}
			}
			lLv.add("");
			lLv.addAll(rLv);
			list.add(lLv);
		}
		return list;
	}

	private int getHeight(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		int h = 0;
		q.offer(root);
		while (!q.isEmpty()) {
			for (int i = q.size(); i > 0; i--) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
			h++;
		}
		return h;
	}

	public List<List<String>> printTree2(TreeNode root) {
		List<List<String>> list = new ArrayList<>();
		int height = getHeight(root);
		int width = (1 << height) - 1;
		for (int i = height; i > 0; i--) {
			List<String> level = new ArrayList<>();
			for (int j = 0; j < width; j++) {
				level.add("");
			}
			list.add(level);
		}
		Queue<TreeNode> q = new LinkedList<>();
		Queue<Integer> idxQ = new LinkedList<>();
		q.offer(root);
		idxQ.offer(0);
		for (int lv = 0, initial = width; lv < height; lv++) {
			int offset = initial + 1;
			initial >>= 1;
			List<String> lvStrs = list.get(lv);
			for (int i = q.size(); i > 0; i--) {
				TreeNode node = q.poll();
				int idx = idxQ.poll();
				lvStrs.set(initial + idx * offset, String.valueOf(node.val));
				if (node.left != null) {
					q.offer(node.left);
					idxQ.offer(idx << 1);
				}
				if (node.right != null) {
					q.offer(node.right);
					idxQ.offer((idx << 1) + 1);
				}
			}
		}
		return list;
	}
}
