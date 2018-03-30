package leetcode.no363_MaxSumOfRectangleNoLargetThanK;

public class Solution {
	public int maxSumSubmatrix(int[][] matrix, int k) {
		int maxsum = Integer.MIN_VALUE;
		int[][] psum = new int[matrix.length + 1][matrix[0].length + 1];
		for (int r = 1; r < psum.length; r++) {
			int rsum = 0;
			for (int c = 1; c < psum[r].length; c++) {
				rsum += matrix[r - 1][c - 1];
				psum[r][c] = psum[r - 1][c] + rsum;
			}
		}
		for (int R = 1; R < psum.length; R++) {
			for (int r = 0; r < R; r++) {
				for (int C = 1; C < psum[r].length; C++) {
					for (int c = 0; c < C; c++) {
						int rect = psum[R][C] - psum[R][c] - psum[r][C] + psum[r][c];
						if (rect < k) {
							maxsum = Integer.max(maxsum, rect);
						} else if (rect == k) {
							return k;
						}
					}
				}
			}
		}
		return maxsum;
	}
}
