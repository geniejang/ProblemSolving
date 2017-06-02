package leetcode.no566_ReshapeTheMatrix;

public class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int len = r * c;
		if (len != nums.length * nums[0].length) {
			return nums;
		}
		int[][] matrix = new int[r][c];
		for (int i = 0; i < len; i++) {
			matrix[i / c][i % c] = nums[i / nums[0].length][i % nums[0].length];
		}
		return matrix;
	}
}
