package leetcode.no378_KthSmallestElementInSortedMatrix;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public int kthSmallestHeap(int[][] matrix, int k) {
		Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				pq.offer(matrix[r][c]);
				if (pq.size() > k) {
					pq.poll();
				}
			}
		}
		return pq.poll();
	}

	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		int lo = matrix[0][0];
		int hi = matrix[n - 1][n - 1];
		while (lo < hi) {
			int mid = lo + ((hi - lo) >> 1);
			int cnt = 0;
			int i = n - 1;
			for (int[] row : matrix) {
				while (i >= 0 && row[i] > mid) {
					i--;
				}
				cnt += i + 1;
			}
			if (cnt < k) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		return lo;
	}
}
