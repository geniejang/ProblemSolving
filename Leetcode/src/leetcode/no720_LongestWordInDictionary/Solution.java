package leetcode.no720_LongestWordInDictionary;

public class Solution {

	class TrieNode {
		char val;
		TrieNode[] children = new TrieNode[26];
		boolean terminal = false;

		TrieNode(char c) {
			this.val = c;
		}
	}

	private TrieNode root = new TrieNode(' ');

	public void insert(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (node.children[idx] == null) {
				node.children[idx] = new TrieNode((char) ('a' + idx));
			}
			node = node.children[idx];
		}
		node.terminal = true;
	}

	private String longestWord(TrieNode node) {
		if (node != root && !node.terminal) {
			return "";
		}
		String longest = "";
		for (int i = 0; i < node.children.length; i++) {
			if (node.children[i] != null) {
				String str = longestWord(node.children[i]);
				if (str.length() > longest.length()) {
					longest = str;
				}
			}
		}
		if (node != root) {
			longest = (char) (node.val) + longest;
		}
		return longest;
	}

	public String longestWord(String[] words) {
		for (String word : words) {
			insert(word);
		}
		return longestWord(root);
	}

}
