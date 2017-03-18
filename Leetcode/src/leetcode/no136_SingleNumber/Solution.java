package leetcode.no136_SingleNumber;

public class Solution {
	public int singleNumber(int[] nums) {
		int single = 0;
		for (int num : nums) {
			single ^= num;
		}
		return single;
	}
}
