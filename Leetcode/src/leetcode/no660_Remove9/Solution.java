package leetcode.no660_Remove9;

public class Solution {
	public int newInteger(int n) {
		int target = n;
		for (int q = n / 9, d = 1; q > 0; q /= 9, d *= 10) {
			target += q * d;
		}
		return target;
	}
}
