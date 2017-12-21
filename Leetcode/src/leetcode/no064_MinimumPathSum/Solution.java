package leetcode.no064_MinimumPathSum;

public class Solution {
	public int minPathSum(int[][] grid) {
		int col = grid[0].length;
		int[] pathSum = new int[col];
		pathSum[0] = grid[0][0];
		for (int c = 1; c < grid[0].length; c++) {
			pathSum[c] = pathSum[c - 1] + grid[0][c];
		}
		for (int r = 1; r < grid.length; r++) {
			pathSum[0] += grid[r][0];
			for (int c = 1; c < grid[r].length; c++) {
				pathSum[c] = grid[r][c] + Integer.min(pathSum[c], pathSum[c - 1]);
			}
		}
		return pathSum[col - 1];
	}
}
