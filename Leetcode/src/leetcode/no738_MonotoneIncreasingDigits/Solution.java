package leetcode.no738_MonotoneIncreasingDigits;

public class Solution {
	public int monotoneIncreasingDigits(int N) {
		int[] digits = new int[10];
		int size = 0;
		while (N > 0) {
			digits[size++] = N % 10;
			N /= 10;
		}
		int idx = -1;
		for (int i = 1; i < size; i++) {
			if (digits[i] > digits[i - 1]) {
				idx = i;
				digits[i]--;
			}
		}
		for (int i = 0; i < idx; i++) {
			digits[i] = 9;
		}
		int monotone = 0;
		for (int i = size - 1; i >= 0; i--) {
			monotone = monotone * 10 + digits[i];
		}
		return monotone;
	}
}
