package leetcode.no658_FindKClosestElements;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int l = 0;
		int r = arr.length - k;
		while (l < r) {
			int c = (l + r) >> 1;
			if (x - arr[c] > arr[c + k] - x) {
				l = c + 1;
			} else {
				r = c;
			}
		}
		List<Integer> list = new ArrayList<>(k);
		for (int i = 0; i < k; i++) {
			list.add(arr[l + i]);
		}
		return list;
	}
}
