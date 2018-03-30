package leetcode.no212_WordSearch2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	class TrieNode {
		TrieNode[] next = new TrieNode[26];
		String word;
	}

	TrieNode buildDictionary(String[] words) {
		TrieNode root = new TrieNode();
		for (String word : words) {
			addWord(root, word);
		}
		return root;
	}

	void addWord(TrieNode root, String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int idx = c - 'a';
			if (node.next[idx] == null) {
				node.next[idx] = new TrieNode();
			}
			node = node.next[idx];
		}
		node.word = word;
	}

	public List<String> findWords(char[][] board, String[] words) {
		List<String> founds = new ArrayList<>(words.length);
		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		TrieNode root = buildDictionary(words);
		for (int r = 0; r < m; r++) {
			for (int c = 0; c < n; c++) {
				if (root.next[board[r][c] - 'a'] != null) {
					dfs(board, r, c, visited, root.next[board[r][c] - 'a'], founds);
				}
			}
		}
		return founds;
	}

	private static final int[][] DIRS = { { -1, 0 }, { +1, 0 }, { 0, -1 }, { 0, +1 } };

	private void dfs(char[][] board, int r, int c, boolean[][] visited, TrieNode node, List<String> founds) {
		visited[r][c] = true;
		if (node.word != null && !founds.contains(node.word)) {
			founds.add(node.word);
		}
		for (int[] DIR : DIRS) {
			int nr = r + DIR[0];
			int nc = c + DIR[1];
			if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[r].length && !visited[nr][nc]
					&& node.next[board[nr][nc] - 'a'] != null) {
				dfs(board, nr, nc, visited, node.next[board[nr][nc] - 'a'], founds);
			}
		}
		visited[r][c] = false;
	}
}
