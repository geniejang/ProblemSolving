package leetcode.no051_NQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private List<List<String>> boards = new ArrayList<>();
	private int[] nQueens;
	char[] row;

	public List<List<String>> solveNQueens(int n) {
		boards.clear();
		nQueens = new int[n];
		row = new char[n];
		Arrays.fill(row, '.');
		placeQueens(0, n);
		return boards;
	}

	private void placeQueens(int r, int n) {
		if (r < n) {
			for (int c = 0; c < n; c++) {
				if (placable(r, c)) {
					nQueens[r] = c;
					placeQueens(r + 1, n);
				}
			}
		} else if (r == n) {
			List<String> board = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				row[nQueens[i]] = 'Q';
				board.add(String.copyValueOf(row));
				row[nQueens[i]] = '.';
			}
			boards.add(board);
		}
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
