package leetcode.no3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int length = 0;
		int start = 0;
		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			Integer index = map.get(c);
			if (index != null && index >= start) {
				start = index + 1;
			}
			length = Math.max(end - start + 1, length);
			map.put(c, end);
		}
 
		return length;
	}
}
