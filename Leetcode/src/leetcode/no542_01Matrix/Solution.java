package leetcode.no542_01Matrix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[][] updateMatrixDP(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] dist = new int[m][n];
		for (int r = 0; r < m; r++) {
			for (int c = 0; c < n; c++) {
				dist[r][c] = matrix[r][c] == 0 ? 0 : 100001;
			}
		}
		for (int r = 0; r < m; r++) {
			for (int c = 1; c < n; c++) {
				dist[r][c] = Integer.min(dist[r][c], dist[r][c - 1] + 1);
				dist[r][n - c - 1] = Integer.min(dist[r][n - c - 1], dist[r][n - c] + 1);
			}
		}
		for (int r = 1; r < m; r++) {
			for (int c = 0; c < n; c++) {
				dist[r][c] = Integer.min(dist[r][c], dist[r - 1][c] + 1);
				dist[m - r - 1][c] = Integer.min(dist[m - r - 1][c], dist[m - r][c] + 1);
			}
		}
		return dist;
	}

	public int[][] updateMatrix(int[][] matrix) {
		int[][] dist = new int[matrix.length][matrix[0].length];
		for (int[] row : dist) {
			Arrays.fill(row, Integer.MAX_VALUE);
		}
		Queue<Integer> q = new LinkedList<>();
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				if (matrix[r][c] == 0) {
					dist[r][c] = 0;
					q.offer(((r) << 16) | (c));
				}
			}
		}
		final int[][] DIRS = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int d = 1; !q.isEmpty(); d++) {
			for (int size = q.size(); size > 0; size--) {
				int r = q.peek() >> 16;
				int c = q.poll() & 0xffff;
				for (int[] dir : DIRS) {
					int nr = r + dir[0];
					int nc = c + dir[1];
					if (nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[r].length && d < dist[nr][nc]) {
						dist[nr][nc] = d;
						q.offer(nr << 16 | nc);
					}
				}
			}
		}
		return dist;
	}
}
