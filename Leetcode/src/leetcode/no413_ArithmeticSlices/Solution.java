package leetcode.no413_ArithmeticSlices;

public class Solution {
	public int numberOfArithmeticSlices(int[] A) {
		if (A == null || A.length <= 2) {
			return 0;
		}
		int diff = A[1] - A[0];
		int idx = 0;
		int cnt = 0;
		for (int i = 1; i + 1 < A.length; i++) {
			if (diff != A[i + 1] - A[i]) {
				diff = A[i + 1] - A[i];
				int n = i - idx;
				if (n >= 2) {
					cnt += n * (n - 1) / 2;
				}
				idx = i;
			}
		}
		if (idx + 2 < A.length) {
			int n = A.length - 1 - idx;
			cnt += n * (n - 1) / 2;
		}
		return cnt;
	}
}
