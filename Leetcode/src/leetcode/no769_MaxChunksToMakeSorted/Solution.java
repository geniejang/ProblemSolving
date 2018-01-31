package leetcode.no769_MaxChunksToMakeSorted;

public class Solution {
	public int maxChunksToSorted(int[] arr) {
		int count = 0;
		int target = 0;
		for (int i = 0; i < arr.length; i++) {
			target = Integer.max(target, arr[i]);
			if (i == target) {
				count++;
			}
		}
		return count;
	}
}
