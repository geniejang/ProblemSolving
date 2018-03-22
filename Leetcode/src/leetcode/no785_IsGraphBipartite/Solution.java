package leetcode.no785_IsGraphBipartite;

public class Solution {
	public boolean isBipartite(int[][] graph) {
		int[] colors = new int[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (colors[i] == 0) {
				colors[i] = 1;
				if (!dfs(graph, colors, i)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean dfs(int[][] graph, int[] colors, int curr) {
		for (int next : graph[curr]) {
			if (colors[next] == 0) {
				colors[next] = colors[curr] ^ 3;
				if (!dfs(graph, colors, next)) {
					return false;
				}
			} else if (colors[next] == colors[curr]) {
				return false;
			}
		}
		return true;
	}
}
