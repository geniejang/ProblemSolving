package leetcode.no397_IntegerReplacement;

public class Solution {
	public int integerReplacement(int n) {
		if ((n & 0xfffffffc) == 0)
			return n - 1;
		int next = (n & 1) == 0 ? (n >> 1) : (n & 2) == 0 ? (n - 1) : (n + 1);
		return 1 + integerReplacement(next);
	}
}
