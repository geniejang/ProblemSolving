package leetcode.no200_NumberOfIslands;

public class Solution {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int cnt = 0;
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				if (grid[r][c] == '1' && !visited[r][c]) {
					dfs(grid, visited, r, c);
					cnt++;
				}
			}
		}
		return cnt;
	}

	private void dfs(char[][] grid, boolean[][] visited, int r, int c) {
		if (r >= 0 && r < grid.length && c >= 0 && c < grid[r].length && grid[r][c] == '1' && !visited[r][c]) {
			visited[r][c] = true;
			dfs(grid, visited, r, c - 1);
			dfs(grid, visited, r, c + 1);
			dfs(grid, visited, r - 1, c);
			dfs(grid, visited, r + 1, c);
		}
	}
}
