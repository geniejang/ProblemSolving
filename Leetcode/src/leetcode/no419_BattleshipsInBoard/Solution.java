package leetcode.no419_BattleshipsInBoard;

public class Solution {
	private boolean isNewShip(char[][] board, int r, int c) {
		return (r == 0 || board[r - 1][c] == '.') && (c == 0 || board[r][c - 1] == '.');
	}

	public int countBattleships(char[][] board) {
		int ships = 0;
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				if (board[r][c] == 'X' && isNewShip(board, r, c)) {
					ships++;
				}
			}
		}
		return ships;
	}
}
