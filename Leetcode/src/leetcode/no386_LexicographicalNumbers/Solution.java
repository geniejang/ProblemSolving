package leetcode.no386_LexicographicalNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			buildLexLIst(list, n, i);
		}
		return list;
	}

	private void buildLexLIst(List<Integer> list, int n, int seed) {
		if (seed > n)
			return;
		list.add(seed);
		for (int i = 0; i < 10; i++) {
			int num = seed * 10 + i;
			buildLexLIst(list, n, num);
		}
	}
}
