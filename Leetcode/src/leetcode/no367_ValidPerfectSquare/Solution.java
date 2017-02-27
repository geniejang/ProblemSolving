package leetcode.no367_ValidPerfectSquare;

public class Solution {
	public boolean isPerfectSquare(int num) {
		int small = 1;
		int big = num;
		while (small <= big) {
			int mid = small + (big - small) / 2;
			long midSquare = (long) mid * mid;
			if (midSquare == num)
				return true;
			else if (midSquare < num)
				small = mid + 1;
			else
				big = mid - 1;
		}
		return false;
	}

	public boolean isPerfectSquare2(int num) {
		long r = num;
		while (r * r > num)
			r = (r + num / r) / 2;
		return r * r == num;
	}
}
