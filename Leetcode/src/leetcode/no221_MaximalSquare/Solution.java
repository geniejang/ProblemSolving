package leetcode.no221_MaximalSquare;

public class Solution {
	public int maximalSquare(char[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		int max = '0';
		for (int c = 0; c < matrix[0].length; c++) {
			if (matrix[0][c] == '1') {
				max = '1';
				break;
			}
		}
		if (max == '0') {
			for (int r = 0; r < matrix.length; r++) {
				if (matrix[r][0] == '1') {
					max = '1';
					break;
				}
			}
		}
		for (int r = 1; r < matrix.length; r++) {
			for (int c = 1; c < matrix[r].length; c++) {
				if (matrix[r][c] == '1') {
					matrix[r][c] = (char) (1
							+ Math.min(matrix[r - 1][c], Math.min(matrix[r - 1][c - 1], matrix[r][c - 1])));
					max = Integer.max(max, matrix[r][c]);
				}
			}
		}
		max -= '0';
		return max * max;
	}

	public int maximalSquare2(char[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
		int max = 0;
		for (int r = 1; r < dp.length; r++) {
			for (int c = 1; c < dp[r].length; c++) {
				if (matrix[r - 1][c - 1] == '1') {
					dp[r][c] = 1 + Integer.min(dp[r - 1][c], Integer.min(dp[r - 1][c - 1], dp[r][c - 1]));
					max = Integer.max(max, dp[r][c]);
				}
			}
		}
		return max * max;
	}
}
