package leetcode.no054_SpiralMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	private static final int[][] DIRS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return Collections.emptyList();
		}
		boolean[][] visited = new boolean[matrix.length + 2][matrix[0].length + 2];
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int c = 0; c < visited[0].length; c++) {
			visited[0][c] = true;
			visited[rows + 1][c] = true;
		}
		for (boolean[] row : visited) {
			row[0] = true;
			row[cols + 1] = true;
		}
		List<Integer> spiral = new ArrayList<>(rows * cols);
		int dir = 0;
		for (int r = 0, c = 0, i = rows * cols; i > 0; i--) {
			spiral.add(matrix[r][c]);
			visited[r + 1][c + 1] = true;
			int nextr = r + DIRS[dir][0];
			int nextc = c + DIRS[dir][1];
			if (visited[nextr + 1][nextc + 1]) {
				dir = (dir + 1) % DIRS.length;
				nextr = r + DIRS[dir][0];
				nextc = c + DIRS[dir][1];
			}
			r = nextr;
			c = nextc;
		}
		return spiral;
	}
}
