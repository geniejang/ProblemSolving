package leetcode.no011_ContainerWithMostWater;

public class Solution {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int l = 0;
		int r = height.length - 1;
		while (l != r) {
			int h = Integer.min(height[l], height[r]);
			maxArea = Integer.max(maxArea, (r - l) * h);
			while (height[l] <= h && l < r) {
				l++;
			}
			while (height[r] <= h && l < r) {
				r--;
			}
		}
		return maxArea;
	}
}
