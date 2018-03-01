package leetcode.no508_MostFrequentSubtreeSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import leetcode.TreeNode;

public class Solution {
	public int[] findFrequentTreeSum(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();
		dfs(root, map);
		/**
		 * Java stream code looks simple; just two lines, but very slow.
		 */
//		int maxFrquency = map.values().stream().max(Integer::compareTo).orElse(0);
//		return map.entrySet().stream().filter(e -> e.getValue() == maxFrquency).mapToInt(Map.Entry::getKey).toArray();
		int[] list = new int[map.size()];
		int cnt = 0;
		int maxFrquency = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > maxFrquency) {
				cnt = 0;
				maxFrquency = e.getValue();
			}
			if (e.getValue() == maxFrquency) {
				list[cnt++] = e.getKey();
			}
		}
		return Arrays.copyOf(list, cnt);
	}

	private int dfs(TreeNode node, Map<Integer, Integer> map) {
		if (node == null) {
			return 0;
		}
		int subtreeSum = node.val + dfs(node.left, map) + dfs(node.right, map);
		map.put(subtreeSum, map.getOrDefault(subtreeSum, 0) + 1);
		return subtreeSum;
	}
}
