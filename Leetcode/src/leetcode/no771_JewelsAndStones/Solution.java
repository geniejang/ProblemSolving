package leetcode.no771_JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int numJewelsInStones(String J, String S) {
		Set<Character> jewels = new HashSet<>(J.length());
		for (char j : J.toCharArray()) {
			jewels.add(j);
		}
		int count = 0;
		for (char s : S.toCharArray()) {
			if (jewels.contains(s)) {
				count++;
			}
		}
		return count;
	}
}
