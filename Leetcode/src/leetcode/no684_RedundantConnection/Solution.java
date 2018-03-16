package leetcode.no684_RedundantConnection;

import java.util.Arrays;

public class Solution {
	public int[] findRedundantConnection(int[][] edges) {
		int[] root = new int[edges.length + 1];
		Arrays.setAll(root, i -> i);
		for (int[] edge : edges) {
			if (root[edge[0]] == root[edge[1]]) {
				return edge;
			}
			int update = root[edge[1]];
			for (int i = 1; i < root.length; i++) {
				if (root[i] == update) {
					root[i] = root[edge[0]];
				}
			}
		}
		return null;
	}

	public int[] findRedundantConnectionArrayWithoutInitialGroups(int[][] edges) {
		int[] root = new int[edges.length + 1];
		for (int[] edge : edges) {
			if (root[edge[0]] == 0 && root[edge[1]] == 0) {
				root[edge[0]] = root[edge[1]] = edge[0];
			} else if (root[edge[0]] == root[edge[1]]) {
				return edge;
			} else if (root[edge[0]] == 0) {
				root[edge[0]] = root[edge[1]];
			} else if (root[edge[1]] == 0) {
				root[edge[1]] = root[edge[0]];
			} else {
				int update = root[edge[1]];
				for (int i = 1; i < root.length; i++) {
					if (root[i] == update) {
						root[i] = root[edge[0]];
					}
				}
			}
		}
		return null;
	}
}
