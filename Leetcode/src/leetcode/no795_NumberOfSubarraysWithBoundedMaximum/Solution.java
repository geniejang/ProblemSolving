package leetcode.no795_NumberOfSubarraysWithBoundedMaximum;

public class Solution {
	public int numSubarrayBoundedMax(int[] A, int L, int R) {
		int cnt = 0;
		for (int i = 0, l = -1, r = -1; i < A.length; i++) {
			if (A[i] >= L) {
				r = i;
			}
			if (A[i] <= R) {
				cnt += r - l; // (l, r]
			} else {
				l = i;
			}
		}
		return cnt;
	}
}
