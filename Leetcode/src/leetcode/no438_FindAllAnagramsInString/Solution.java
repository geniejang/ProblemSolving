package leetcode.no438_FindAllAnagramsInString;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new LinkedList<Integer>();
		if (s == null || s.length() < p.length()) {
			return list;
		}

		int[] count = new int[26];
		for (int i = 0; i < p.length(); i++) {
			count[p.charAt(i) - 'a']++;
			count[s.charAt(i) - 'a']--;
		}
		if (isAllZero(count)) {
			list.add(0);
		}
		for (int i = 0; i < s.length() - p.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[s.charAt(i + p.length()) - 'a']--;
			if (isAllZero(count)) {
				list.add(i + 1);
			}
		}
		return list;
	}

	private boolean isAllZero(int[] nums) {
		for (int num : nums) {
			if (num != 0) {
				return false;
			}
		}
		return true;
	}
}
