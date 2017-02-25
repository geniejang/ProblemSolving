package leetcode.no119_PascalsTriangle2;

import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		Integer[] prev = new Integer[rowIndex + 1];
		Integer[] curr = new Integer[rowIndex + 1];
		Arrays.fill(prev, new Integer(0));
		Arrays.fill(curr, new Integer(0));
		prev[0] = 1;
		curr[0] = 1;
		for (int i = 0; i < rowIndex; i++) {
			for (int j = 0; j < i + 1; j++) {
				curr[j + 1] = prev[j] + prev[j + 1];
			}
			Integer[] temp = prev;
			prev = curr;
			curr = temp;
		}

		return Arrays.asList(prev);
	}
}
