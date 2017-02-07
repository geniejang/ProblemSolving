package leetcode.no463_IslandPerimeter;

public class Solution {
	private int countAdjacentSea(int[][] grid, int r, int c) {
		if (grid[r][c] == 0)
			return 0;
		int adjacentSea = 0;
		if (r == 0 || grid[r - 1][c] == 0)
			adjacentSea += 1;
		if (c == 0 || grid[r][c - 1] == 0)
			adjacentSea += 1;
		if (r + 1 == grid.length || grid[r + 1][c] == 0)
			adjacentSea += 1;
		if (c + 1 == grid[r].length || grid[r][c + 1] == 0)
			adjacentSea += 1;
		return adjacentSea;
	}

	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				perimeter += countAdjacentSea(grid, r, c);
			}
		}
		return perimeter;
	}
}
