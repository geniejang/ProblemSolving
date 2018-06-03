package leetcode.no056_MergeIntervals;

import java.util.ArrayList;
import java.util.List;

import leetcode.Interval;

public class Solution {
	public List<Interval> merge(List<Interval> intervals) {
		intervals.sort((a, b) -> a.start - b.start);
		List<Interval> merged = new ArrayList<>();
		Interval curr = null;
		for (Interval i : intervals) {
			if (curr == null || curr.end < i.start) {
				curr = new Interval(i.start, i.end);
				merged.add(curr);
			} else if (curr.end < i.end) {
				curr.end = i.end;
			}
		}
		return merged;
	}
}
