package leetcode.no655_PrintBinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
}
