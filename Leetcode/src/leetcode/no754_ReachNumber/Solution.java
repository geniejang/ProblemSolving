package leetcode.no754_ReachNumber;

public class Solution {
	public int reachNumber(int target) {
		long k = target > 0 ? target : -target;
		long n = (int) Math.ceil((Math.sqrt(8 * k + 1) - 1) / 2);
		long sum = n * (n + 1) / 2;
		if (((sum - k) & 1) == 1) {
			n += (n & 1) == 0 ? 1 : 2;
		}
		return (int) n;
	}
}
