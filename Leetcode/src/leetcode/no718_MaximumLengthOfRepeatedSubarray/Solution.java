package leetcode.no718_MaximumLengthOfRepeatedSubarray;

import java.util.Arrays;

public class Solution {
	public int findLength(int[] A, int[] B) {
		int maxlen = 0;
		for (int i = 0; i + maxlen < A.length; i++) {
			for (int j = 0; j + maxlen < B.length; j++) {
				int offset = 0;
				for (int limit = Integer.min(A.length - i, B.length - j); offset < limit; offset++) {
					if (A[i + offset] != B[j + offset]) {
						break;
					}
				}
				maxlen = Integer.max(maxlen, offset);
			}
		}
		return maxlen;
	}

	public int findLengthDpMat(int[] A, int[] B) {
		int[][] dp = new int[A.length + 1][B.length + 1];
		int maxlen = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
					maxlen = Integer.max(maxlen, dp[i + 1][j + 1]);
				}
			}
		}
		return maxlen;
	}

	public int findLengthDP(int[] A, int[] B) {
		int[] dp = new int[B.length + 1];
		int maxlen = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = B.length; j > 0; j--) {
				if (A[i] == B[j - 1]) {
					dp[j] = dp[j - 1] + 1;
					maxlen = Integer.max(maxlen, dp[j]);
				} else {
					dp[j] = 0;
				}
			}
		}
		return maxlen;
	}

	public int findLengthKMP(int[] A, int[] B) {
		int maxlen = 0;
		int[] bi = new int[B.length];
		for (int start = 0; start + maxlen < B.length; start++) {
			Arrays.fill(bi, start);
			for (int i = start + 1, j = start; i < B.length; i++) {
				while (j > start && B[i] != B[j]) {
					j = bi[j - 1];
				}
				if (B[i] == B[j]) {
					bi[i] = ++j;
				}
			}
			for (int i = 0, j = start; i < A.length; i++) {
				while (j > start && A[i] != B[j]) {
					j = bi[j - 1];
				}
				if (A[i] == B[j]) {
					maxlen = Integer.max(maxlen, ++j - start);
					if (j == B.length) {
						j = bi[j - 1];
					}
				}
			}
		}
		return maxlen;
	}
}
