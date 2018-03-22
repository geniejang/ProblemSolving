package leetcode.no547_FriendCircles;

public class Solution {
	public int findCircleNum(int[][] M) {
		int cnt = 0;
		boolean[] visited = new boolean[M.length];
		for (int i = 0; i < M.length; i++) {
			if (!visited[i]) {
				dfs(M, visited, i);
				cnt++;
			}
		}
		return cnt;
	}

	private void dfs(int[][] m, boolean[] visited, int curr) {
		visited[curr] = true;
		for (int i = 0; i < m.length; i++) {
			if (!visited[i] && m[curr][i] == 1) {
				dfs(m, visited, i);
			}
		}
	}
}
