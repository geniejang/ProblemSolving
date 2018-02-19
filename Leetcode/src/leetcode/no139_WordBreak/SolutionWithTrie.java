package leetcode.no139_WordBreak;

import java.util.List;

public class SolutionWithTrie {
	class TrieNode {
		char val;
		boolean isWord = false;
		TrieNode[] nexts = new TrieNode[26];

		TrieNode(char c) {
			val = c;
		}
	}

	TrieNode root = new TrieNode(' ');
	private boolean[] checked;

	private void addWord(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int idx = c - 'a';
			if (node.nexts[idx] == null) {
				node.nexts[idx] = new TrieNode(c);
			}
			node = node.nexts[idx];
		}
		if (node != root) {
			node.isWord = true;
		}
	}

	public boolean wordBreak(String s, List<String> wordDict) {
		for (String word : wordDict) {
			addWord(word);
		}
		checked = new boolean[s.length()];
		return isCompleteWords(s.toCharArray(), 0);
	}

	private boolean isCompleteWords(char[] s, int idx) {
		if (idx == s.length) {
			return true;
		}
		if (!checked[idx]) {
			TrieNode node = root;
			for (int i = idx; i < s.length && node.nexts[s[i] - 'a'] != null; i++) {
				node = node.nexts[s[i] - 'a'];
				if (node.isWord && isCompleteWords(s, i + 1)) {
					return true;
				}
			}
			checked[idx] = true;
		}
		return false;
	}
}
