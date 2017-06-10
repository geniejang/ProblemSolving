package leetcode.no565_ArrayNesting;

public class Solution {
	public int arrayNesting(int[] nums) {
		boolean[] visited = new boolean[nums.length];
		int largest = 0;
		int remained = nums.length;
		for (int i = 0; largest < remained && i < visited.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 0;
			int idx = i;
			while (!visited[idx]) {
				visited[idx] = true;
				count++;
				idx = nums[idx];
			}
			largest = Integer.max(largest, count);
			remained -= count;
		}
		return largest;
	}
}
