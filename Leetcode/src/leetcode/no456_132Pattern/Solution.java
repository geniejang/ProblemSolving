package leetcode.no456_132Pattern;

public class Solution {
	public boolean find132pattern(int[] nums) {
		int i = 0;
		while (i < nums.length - 2) {
			while (i < nums.length - 2 && nums[i] >= nums[i + 1])
				i++;
			int j = i + 1;
			while (j < nums.length - 1 && nums[j] <= nums[j + 1])
				j++;
			int k = j + 1;
			while (k < nums.length) {
				if (nums[k] > nums[i] && nums[k] < nums[j])
					return true;
				k++;
			}
			i = j + 1;
		}
		return false;
	}
}
