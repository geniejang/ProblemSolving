package leetcode.no435_NonOverlappingIntervals;

import java.util.Arrays;

import leetcode.Interval;

public class Solution {
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, (a, b) -> a.end - b.end);
		int prevEnd = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i].start < prevEnd) {
				count++;
			} else {
				prevEnd = intervals[i].end;
			}
		}
		return count;
	}
}
