package euler.no011_LargestProductInGrid;

import java.util.Scanner;

public class Solution {
	private static final int LEN = 20;
	private static final int DIG = LEN - 3;

	private static int largestLineProduct(int[][] grid, int sx, int sy, int dx, int dy) {
		int largest = 0;
		int x = sx;
		int y = sy;
		int product = 1;
		while (x < LEN && y < LEN && x >= 0 && y >= 0) {
			if (grid[x][y] == 0) {
				sx = x + dx;
				sy = y + dy;
				product = 1;
			} else {
				if (sx + 4 * dx == x && sy + 4 * dy == y) {
					product /= grid[sx][sy];
					sx += dx;
					sy += dy;
				}
				product *= grid[x][y];
				if (sx + 3 * dx == x && sy + 3 * dy == y) {
					largest = Integer.max(product, largest);
				}
			}
			x += dx;
			y += dy;
		}
		return largest;
	}

	public static int solve(int[][] grid) {
		int largest = Integer.max(largestLineProduct(grid, 0, 0, 1, 1), largestLineProduct(grid, 0, LEN - 1, 1, -1));
		for (int i = 1; i < DIG; i++) {
			largest = Integer.max(largest, largestLineProduct(grid, i, 0, 1, 1));
			largest = Integer.max(largest, largestLineProduct(grid, 0, i, 1, 1));
			largest = Integer.max(largest, largestLineProduct(grid, 0, i + 2, 1, -1));
			largest = Integer.max(largest, largestLineProduct(grid, i, LEN - 1, 1, -1));
		}
		for (int i = 0; i < LEN; i++) {
			largest = Integer.max(largest, largestLineProduct(grid, i, 0, 0, 1));
			largest = Integer.max(largest, largestLineProduct(grid, 0, i, 1, 0));
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[LEN][LEN];
		for (int grid_i = 0; grid_i < LEN; grid_i++) {
			for (int grid_j = 0; grid_j < LEN; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(solve(grid));
		in.close();
	}
}
