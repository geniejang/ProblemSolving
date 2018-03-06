package leetcode.no788_RotatedDigits;

public class Solution {
	public int rotatedDigits(int N) {
		int cnt = 0;
		for (int i = 2; i <= N; i++) {
			if (isGood(i)) {
				cnt++;
			}
		}
		return cnt;
	}

	private boolean isGood(int d) {
		boolean good = false;
		while (d > 0) {
			switch (d % 10) {
			case 2:
			case 5:
			case 6:
			case 9:
				good = true;
				break;
			case 3:
			case 4:
			case 7:
				return false;
			}
			d /= 10;
		}
		return good;
	}
}
