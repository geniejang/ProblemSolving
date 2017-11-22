package leetcode.no208_ImplementTrie;

class Trie {

	class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean terminal = false;
	}

	private TrieNode root;

	/** Initialize your data structure here. */
	public Trie() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (node.children[idx] == null) {
				node.children[idx] = new TrieNode();
			}
			node = node.children[idx];
		}
		node.terminal = true;
	}

	private TrieNode getLastNode(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (node.children[idx] == null) {
				return root;
			}
			node = node.children[idx];
		}
		return node;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		return getLastNode(word).terminal;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given
	 * prefix.
	 */
	public boolean startsWith(String prefix) {
		return getLastNode(prefix) != root;
	}
}

/**
 * Your Trie object will be instantiated and called as such: Trie obj = new
 * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
 * = obj.startsWith(prefix);
 */