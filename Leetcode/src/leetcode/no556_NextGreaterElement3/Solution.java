package leetcode.no556_NextGreaterElement3;

import java.util.Arrays;

public class Solution {
	public int nextGreaterElement(int n) {
		char[] s = ("" + n).toCharArray();
		int len = s.length;
		int i = len - 2;
		while (i >= 0 && s[i] >= s[i + 1]) {
			i--;
		}
		if (i < 0) {
			return -1;
		}
		int j = len - 1;
		while (s[i] >= s[j]) {
			j--;
		}
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		Arrays.sort(s, i + 1, len);
		long result = Long.parseLong(String.valueOf(s));
		return result > Integer.MAX_VALUE ? -1 : (int) result;
	}

	private void swap(int[] s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

	public int nextGreaterElementWithPrimitives(int n) {
		int[] s = new int[10];
		int len = 0;
		for (int i = 0; n > 0; i++) {
			s[i] = n % 10;
			n /= 10;
			len++;
		}
		int i = 1;
		while (i < len && s[i] >= s[i - 1]) {
			i++;
		}
		if (i == len) {
			return -1;
		}
		int j = 0;
		while (s[i] >= s[j]) {
			j++;
		}
		swap(s, i, j);
		for (int k = 1; i - k > k - 1; k++) {
			if (s[i - k] <= s[k - 1]) {
				break;
			}
			swap(s, i - k, k - 1);
		}
		int result = 0;
		for (int d = len - 1; d > 0; d--) {
			result = result * 10 + s[d];
		}
		if (result > (Integer.MAX_VALUE - s[0]) / 10) {
			return -1;
		}
		return result * 10 + s[0];
	}
}
