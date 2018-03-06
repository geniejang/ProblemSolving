package leetcode.no658_FindKClosestElements;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int i = bsearch(arr, x);
		int l = i;
		int r = i + 1;
		while (r - l < k) {
			if (l == 0) {
				r++;
			} else if (r == arr.length) {
				l--;
			} else if (x - arr[l - 1] <= arr[r] - x) {
				l--;
			} else {
				r++;
			}
		}
		List<Integer> list = new ArrayList<>(k);
		for (int idx = l; idx < r; idx++) {
			list.add(arr[idx]);
		}
		return list;
	}

	private int bsearch(int[] arr, int x) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int c = (l + r) >> 1;
			int diff = arr[c] - x;
			if (diff == 0) {
				return c;
			} else if (diff < 0) {
				l = c + 1;
			} else {
				r = c - 1;
			}
		}
		return l;
	}
}
