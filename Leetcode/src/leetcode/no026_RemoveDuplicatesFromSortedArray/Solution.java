package leetcode.no026_RemoveDuplicatesFromSortedArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length < 1) {
			return 0;
		}
		int cnt = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[cnt]) {
				nums[++cnt] = nums[i];
			}
		}
		return cnt + 1;
	}
}
