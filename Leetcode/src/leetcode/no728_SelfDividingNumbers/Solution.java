package leetcode.no728_SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private boolean isSelfDivisible(int n) {
		for (int q = n; q > 0; q /= 10) {
			int d = q % 10;
			if (d == 0 || n % d > 0) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int n = left; n <= right; n++) {
			if (isSelfDivisible(n)) {
				list.add(n);
			}
		}
		return list;
	}
}
