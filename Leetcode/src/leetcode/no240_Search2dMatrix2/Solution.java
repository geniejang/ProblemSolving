package leetcode.no240_Search2dMatrix2;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		for (int[] row : matrix) {
			int l = 0;
			int r = row.length;
			while (l < r) {
				int p = l + ((r - l) >> 1);
				if (row[p] < target) {
					l = p + 1;
				} else if (row[p] > target) {
					r = p;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	public boolean searchMatrix2(int[][] matrix, int target) {
		int r = 0;
		int c = matrix[0].length - 1;
		while (r < matrix.length && c >= 0) {
			if (matrix[r][c] == target) {
				return true;
			} else if (matrix[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}
		return false;
	}
}
