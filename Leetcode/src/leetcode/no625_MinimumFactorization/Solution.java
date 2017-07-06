package leetcode.no625_MinimumFactorization;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int smallestFactorization(int a) {
		List<Integer> factors = new ArrayList<>(10);
		for (int f = 9; f > 1; f--) {
			while (a % f == 0) {
				factors.add(f);
				a /= f;
			}
		}
		if (a > 1 || factors.size() > 9) {
			return 0;
		}
		int ret = 0;
		for (int i = factors.size() - 1; i >= 0; i--) {
			ret = ret * 10 + factors.get(i);
		}
		return ret;
	}
}
