package leetcode.no498_DiagonalTraverse;

public class Solution {
	public int[] findDiagonalOrder(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0)
			return new int[0];
		int nRow = matrix.length;
		int nCol = matrix[0].length;

		int[] diagonal = new int[nRow * nCol];
		int r = 0;
		int c = 0;
		for (int i = 0; i < diagonal.length; i++) {
			diagonal[i] = matrix[r][c];
			if (0 == ((r ^ c) & 1)) {
				r--;
				c++;
				if (c == nCol) {
					c--;
					r += 2;
				} else if (r == -1) {
					r = 0;
				}
			} else {
				r++;
				c--;
				if (r == nRow) {
					r--;
					c += 2;
				} else if (c == -1) {
					c = 0;
				}
			}
		}
		return diagonal;
	}
}
