package leetcode.no074_Search2dMatrix;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int l = 0;
		int r = m * n;
		while (l < r) {
			int c = (l + r) >> 1;
			if (matrix[c / n][c % n] == target) {
				return true;
			} else if (matrix[c / n][c % n] < target) {
				l = c + 1;
			} else {
				r = c;
			}
		}
		return false;
	}
}
