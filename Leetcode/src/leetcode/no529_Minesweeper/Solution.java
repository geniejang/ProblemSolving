package leetcode.no529_Minesweeper;

public class Solution {
	private static final int[][] OFFSETS = { { -1, -1 }, { -1, 0 }, { -1, 1 },
			{ 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

	private boolean inBoard(char[][] board, int r, int c) {
		return r >= 0 && r < board.length && c >= 0 && c < board[0].length;
	}

	public char[][] updateBoard(char[][] board, int[] click) {
		char val = board[click[0]][click[1]];
		if (val == 'M') {
			board[click[0]][click[1]] = 'X';
		} else if (val == 'E') {
			int count = 0;
			for (int i = 0; i < OFFSETS.length; i++) {
				int r = click[0] + OFFSETS[i][0];
				int c = click[1] + OFFSETS[i][1];
				if (inBoard(board, r, c) && board[r][c] == 'M') {
					count++;
				}
			}
			if (count > 0) {
				board[click[0]][click[1]] = (char) (count + '0');
			} else {
				board[click[0]][click[1]] = 'B';
				for (int i = 0; i < OFFSETS.length; i++) {
					int r = click[0] + OFFSETS[i][0];
					int c = click[1] + OFFSETS[i][1];
					if (inBoard(board, r, c) && board[r][c] == 'E') {
						updateBoard(board, new int[] { r, c });
					}
				}
			}
		}

		return board;
	}
}
