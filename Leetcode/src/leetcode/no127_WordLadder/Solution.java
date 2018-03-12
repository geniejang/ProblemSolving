package leetcode.no127_WordLadder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		boolean[][] transform = new boolean[wordList.size()][wordList.size()];
		for (int i = wordList.size() - 1; i >= 0; i--) {
			String word = wordList.get(i);
			for (int j = 0; j < i; j++) {
				if (hasSingleDiff(word, wordList.get(j))) {
					transform[i][j] = transform[j][i] = true;
				}
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < wordList.size(); i++) {
			if (hasSingleDiff(beginWord, wordList.get(i))) {
				q.offer(i);
			}
		}
		int end = wordList.indexOf(endWord);
		boolean[] visited = new boolean[wordList.size()];
		for (int words = 2; !q.isEmpty(); words++) {
			for (int i = q.size(); i > 0; i--) {
				int idx = q.poll();
				if (idx == end) {
					return words;
				}
				if (!visited[idx]) {
					visited[idx] = true;
					for (int j = 0; j < transform.length; j++) {
						if (!visited[j] && transform[idx][j]) {
							q.offer(j);
						}
					}
				}
			}
		}
		return 0;
	}

	private boolean hasSingleDiff(String a, String b) {
		int diffs = 0;
		for (int k = a.length() - 1; k >= 0; k--) {
			if (a.charAt(k) != b.charAt(k)) {
				diffs++;
			}
		}
		return diffs == 1;
	}
}
