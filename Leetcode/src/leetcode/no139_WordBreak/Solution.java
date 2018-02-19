package leetcode.no139_WordBreak;

import java.util.List;

public class Solution {
	private boolean[] checked;
	private List<String> wordDict;

	public boolean wordBreak(String s, List<String> wordDict) {
		checked = new boolean[s.length()];
		this.wordDict = wordDict;
		return isCompleteWords(s, 0);
	}

	private boolean isCompleteWords(String s, int idx) {
		if (idx == s.length()) {
			return true;
		}
		if (!checked[idx]) {
			for (int i = 0; i < wordDict.size(); i++) {
				String word = wordDict.get(i);
				if (s.startsWith(word, idx) && isCompleteWords(s, idx + word.length())) {
					return true;
				}
			}
			checked[idx] = true;
		}
		return false;
	}
}
