package leetcode.no027_RemoveElement;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int newLength = nums.length;
		int i = 0;
		while (i < newLength) {
			if (nums[i] == val)
				nums[i] = nums[--newLength];
			if (nums[i] != val)
				i++;
		}
		return newLength;
	}
}
