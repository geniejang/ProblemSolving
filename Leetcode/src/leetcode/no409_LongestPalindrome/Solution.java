package leetcode.no409_LongestPalindrome;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public int longestPalindrome3(String s) {
		int[] upper = new int[26];
		int[] lower = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < 'a') {
				upper[c - 'A']++;
			} else {
				lower[c - 'a']++;
			}
		}
		int len = 0;
		for (int i = 0; i < 26; i++) {
			len += upper[i] & 0xfffffffe;
			len += lower[i] & 0xfffffffe;
		}
		return len == s.length() ? len : len + 1;
	}

	public int longestPalindrome2(String s) {
		Set<Character> set = new HashSet<>();
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (set.contains(c)) {
				set.remove(c);
				len += 2;
			} else {
				set.add(c);
			}
		}
		return len == s.length() ? len : len + 1;
	}

	public int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, 1 + map.getOrDefault(c, 0));
		}
		int len = 0;
		for (int count : map.values()) {
			len += count & 0xfffffffe;
		}
		return len == s.length() ? len : len + 1;
	}
}
