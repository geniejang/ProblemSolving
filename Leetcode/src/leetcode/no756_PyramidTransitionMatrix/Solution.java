package leetcode.no756_PyramidTransitionMatrix;

import java.util.List;

public class Solution {
	public boolean pyramidTransition(String bottom, List<String> allowed) {
		int[][] map = new int[26][26];
		for (String triangle : allowed) {
			map[triangle.charAt(0) - 'A'][triangle.charAt(1) - 'A'] |= 1 << (triangle.charAt(2) - 'A');
		}
		int[] line = new int[bottom.length()];
		for (int i = 0; i < line.length; i++) {
			line[i] = bottom.charAt(i) - 'A';
		}
		return transit(map, line, 1, line.length);
	}

	private boolean transit(int[][] map, int[] line, int idx, int length) {
		if (length == 1) {
			return true;
		}
		int to = map[line[idx - 1]][line[idx]];
		for (int i = 0; i < 26; i++) {
			int backtrace = line[idx - 1];
			if ((to & (1 << i)) != 0) {
				line[idx - 1] = i;
				boolean ret = false;
				if (idx + 1 == length) {
					ret = transit(map, line, 1, length - 1);
				} else {
					ret = transit(map, line, idx + 1, length);
				}
				if (ret) {
					return true;
				}
			}
			line[idx - 1] = backtrace;
		}
		return false;
	}
}
