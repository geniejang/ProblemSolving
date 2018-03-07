package leetcode.no454_4Sum2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer, Integer> AB = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				AB.put(A[i] + B[j], AB.getOrDefault(A[i] + B[j], 0) + 1);
			}
		}
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				cnt += AB.getOrDefault(-(C[i] + D[j]), 0);
			}
		}
		return cnt;
	}

	public int fourSumCount2(int[] A, int[] B, int[] C, int[] D) {
		int[] ab = new int[A.length * B.length];
		int[] cd = new int[C.length * D.length];
		int idx = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				ab[idx] = A[i] + B[j];
				cd[idx] = C[i] + D[j];
				idx++;
			}
		}
		Arrays.sort(ab);
		Arrays.sort(cd);
		int iab = 0;
		int icd = cd.length - 1;
		int cnt = 0;
		while (iab < ab.length && icd >= 0) {
			if (ab[iab] + cd[icd] < 0) {
				iab++;
			} else if (ab[iab] + cd[icd] > 0) {
				icd--;
			} else {
				int nab = 1;
				int ncd = 1;
				while (++iab < ab.length && ab[iab] == ab[iab - 1]) {
					nab++;
				}
				while (--icd >= 0 && cd[icd] == cd[icd + 1]) {
					ncd++;
				}
				cnt += nab * ncd;
			}
		}
		return cnt;
	}
}
