package leetcode.no553_OptimalDivision;

public class Solution {
	public String optimalDivision(int[] nums) {
		StringBuilder sb = new StringBuilder();
		sb.append(nums[0]);
		switch (nums.length) {
		case 1:
			break;
		case 2:
			sb.append("/").append(nums[1]);
			break;
		default:
			sb.append("/(").append(nums[1]);
			for (int i = 2; i < nums.length; i++) {
				sb.append("/").append(nums[i]);
			}
			sb.append(")");
		}
		return sb.toString();
	}
}
