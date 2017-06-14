package leetcode.no611_ValidTriangleNumber;

import java.util.Arrays;

public class Solution {
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int x = 0; x < nums.length - 2; x++) {
			int y = x + 1;
			int z = y + 1;
			while (y < nums.length - 1) {
				while (y == z || (z < nums.length && nums[x] + nums[y] > nums[z])) {
					z++;
				}
				count += z - y - 1;
				y++;
			}
		}
		return count;
	}
}
