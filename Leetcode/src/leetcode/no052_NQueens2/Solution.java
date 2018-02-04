package leetcode.no052_NQueens2;

public class Solution {
	private int[] nQueens;

	public int totalNQueens(int n) {
		nQueens = new int[n];
		return placeQueens(0, n);
	}

	private int placeQueens(int r, int n) {
		int count = 0;
		if (r < n) {
			for (int c = 0; c < n; c++) {
				if (placable(r, c)) {
					nQueens[r] = c;
					count += placeQueens(r + 1, n);
				}
			}
		} else if (r == n) {
			count = 1;
		}
		return count;
	}

	private boolean placable(int r, int c) {
		for (int i = 0; i < r; i++) {
			if (c == nQueens[i] || c - nQueens[i] == r - i || nQueens[i] - c == r - i) {
				return false;
			}
		}
		return true;
	}
}
