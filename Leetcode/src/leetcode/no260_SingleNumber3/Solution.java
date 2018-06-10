package leetcode.no260_SingleNumber3;

public class Solution {
	public int[] singleNumber(int[] nums) {
		int[] singles = new int[2];
		int xor = 0;
		for (int num : nums) {
			xor ^= num;
		}
		int bit = 0;
		while ((xor & (1 << bit)) == 0) {
			bit++;
		}
		for (int num : nums) {
			if ((num & (1 << bit)) > 0) {
				singles[0] ^= num;
			}
		}
		singles[1] = xor ^ singles[0];
		return singles;
	}
}
