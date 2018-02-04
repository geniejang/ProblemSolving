package leetcode.no048_RotateImage;

public class Solution {
	public void rotate(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = r + 1; c < matrix.length; c++) {
				int temp = matrix[r][c];
				matrix[r][c] = matrix[c][r];
				matrix[c][r] = temp;
			}
		}
		for (int[] row : matrix) {
			for (int c = 0; c < row.length / 2; c++) {
				int pair = row.length - c - 1;
				int temp = row[c];
				row[c] = row[pair];
				row[pair] = temp;
			}
		}
	}

	public void rotate2(int[][] matrix) {
		int n = matrix.length - 1;
		int rLen = matrix.length / 2;
		int cLen = rLen + (matrix.length & 1);
		for (int r = 0; r < rLen; r++) {
			int ir = n - r;
			for (int c = 0; c < cLen; c++) {
				int ic = n - c;
				int temp = matrix[r][c];
				matrix[r][c] = matrix[ic][r];
				matrix[ic][r] = matrix[ir][ic];
				matrix[ir][ic] = matrix[c][ir];
				matrix[c][ir] = temp;
			}
		}
	}
}
