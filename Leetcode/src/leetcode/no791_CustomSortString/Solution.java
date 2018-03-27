package leetcode.no791_CustomSortString;

public class Solution {
	public String customSortString(String S, String T) {
		int[] cnt = new int[26];
		for (char c : T.toCharArray()) {
			cnt[c - 'a']++;
		}
		StringBuilder sb = new StringBuilder(T.length());
		for (char c : S.toCharArray()) {
			for (int idx = c - 'a'; cnt[idx] > 0; cnt[idx]--) {
				sb.append(c);
			}
		}
		for (int i = 0; sb.length() < T.length(); i++) {
			for (char c = (char) ('a' + i); cnt[i] > 0; cnt[i]--) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
