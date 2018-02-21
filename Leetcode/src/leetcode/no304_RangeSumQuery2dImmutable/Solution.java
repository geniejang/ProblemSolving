package leetcode.no304_RangeSumQuery2dImmutable;

class NumMatrix {
	int[][] psum;

	public NumMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			psum = new int[0][];
			return;
		}
		psum = new int[matrix.length + 1][matrix[0].length + 1];
		for (int r = 1; r < psum.length; r++) {
			for (int c = 1; c < psum[r].length; c++) {
				psum[r][c] = psum[r - 1][c] + psum[r][c - 1] - psum[r - 1][c - 1] + matrix[r - 1][c - 1];
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		return psum[row2 + 1][col2 + 1] - psum[row2 + 1][col1] - psum[row1][col2 + 1] + psum[row1][col1];
	}
}
