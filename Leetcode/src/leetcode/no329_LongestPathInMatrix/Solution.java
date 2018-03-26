package leetcode.no329_LongestPathInMatrix;

public class Solution {
	private static final int[][] DIRS = { { -1, 0 }, { +1, 0 }, { 0, -1 }, { 0, +1 } };

	public int longestIncreasingPath(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		int[][] path = new int[matrix.length][matrix[0].length];
		int longest = 1;
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				longest = Integer.max(longest, dfs(matrix, path, r, c));
			}
		}
		return longest;
	}

	private int dfs(int[][] matrix, int[][] path, int r, int c) {
		if (path[r][c] == 0) {
			int longest = 0;
			for (int[] DIR : DIRS) {
				int nr = r + DIR[0];
				int nc = c + DIR[1];
				if (nr >= 0 && nr < path.length && nc >= 0 && nc < path[r].length && matrix[r][c] < matrix[nr][nc]) {
					longest = Integer.max(longest, dfs(matrix, path, nr, nc));
				}
			}
			path[r][c] = 1 + longest;
		}
		return path[r][c];
	}
}
