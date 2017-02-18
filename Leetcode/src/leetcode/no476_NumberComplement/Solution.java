package leetcode.no476_NumberComplement;

public class Solution {
	public int findComplement(int num) {
		int mask = ~0;
		while ((mask & num) > 0) {
			mask <<= 1;
		}
		return ~mask ^ num;
	}
}
