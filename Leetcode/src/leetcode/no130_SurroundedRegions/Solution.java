package leetcode.no130_SurroundedRegions;

public class Solution {
	public void solve(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return;
		}
		boolean[][] visited = new boolean[board.length][board[0].length];
		for (int r = 0; r < board.length; r++) {
			dfs(board, visited, r, 0);
			dfs(board, visited, r, board[r].length - 1);
		}
		for (int c = 0; c < board[0].length; c++) {
			dfs(board, visited, 0, c);
			dfs(board, visited, board.length - 1, c);
		}
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				if (board[r][c] == 'O' && !visited[r][c]) {
					board[r][c] = 'X';
				}
			}
		}
	}

	private void dfs(char[][] board, boolean[][] visited, int r, int c) {
		if (r >= 0 && r < board.length && c >= 0 && c < board[r].length && board[r][c] == 'O' && !visited[r][c]) {
			visited[r][c] = true;
			dfs(board, visited, r, c - 1);
			dfs(board, visited, r, c + 1);
			dfs(board, visited, r - 1, c);
			dfs(board, visited, r + 1, c);
		}
	}
}
