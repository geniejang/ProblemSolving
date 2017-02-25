package leetcode.no191_NumberOf1Bits;

public class Solution {
	public int hammingWeight(int n) {
		int count = 0;
		for (int mask = 1; mask != 0; mask <<= 1)
			if ((n & mask) != 0)
				count++;
		return count;
	}
}
