package leetcode.no7_ReverseInteger;

public class Solution {
    private static int threshold = Integer.MAX_VALUE / 10;

    public int reverse(int x) {
		boolean isMinus = x < 0;
		if (isMinus)
			x *= -1;
		int result = 0;
		while (x > 0) {
			if (result > threshold)
				return 0;
			result = result * 10 + x % 10;
			x /= 10;
		}
		return isMinus ? -result : result;
    }
}
