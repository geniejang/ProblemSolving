package leetcode.no413_ArithmeticSlices;

public class Solution {
	public int numberOfArithmeticSlices(int[] A) {
		if (A == null || A.length <= 2) {
			return 0;
		}
		int diff = A[1] - A[0];
		int cnt = 0;
		int n = 0;
		for (int i = 2; i < A.length; i++) {
			if (diff == A[i] - A[i - 1]) {
				cnt += ++n;
			} else {
				diff = A[i] - A[i - 1];
				n = 0;
			}
		}
		return cnt;
	}
}
