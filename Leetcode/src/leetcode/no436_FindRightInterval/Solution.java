package leetcode.no436_FindRightInterval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import leetcode.Interval;

public class Solution {
	public int[] findRightInterval(Interval[] intervals) {
		Map<Interval, Integer> map = new HashMap<>();
		for (int i = 0; i < intervals.length; i++) {
			map.put(intervals[i], i);
		}
		map.put(null, -1);
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		int[] indices = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			indices[map.get(intervals[i])] = map.get(bsearch(intervals, i, intervals[i].end));
		}
		return indices;
	}

	private Interval bsearch(Interval[] intervals, int i, int target) {
		int l = i + 1;
		int r = intervals.length;
		while (l < r) {
			int p = (l + r) >> 1;
			if (intervals[p].start < target) {
				l = p + 1;
			} else if (intervals[p - 1].start < target) {
				return intervals[p];
			} else {
				r = p;
			}
		}
		return null;
	}

	public int[] findRightIntervalTreeMap(Interval[] intervals) {
		int[] result = new int[intervals.length];
		java.util.NavigableMap<Integer, Integer> intervalMap = new TreeMap<>();
		for (int i = 0; i < intervals.length; ++i) {
			intervalMap.put(intervals[i].start, i);
		}
		for (int i = 0; i < intervals.length; ++i) {
			Map.Entry<Integer, Integer> entry = intervalMap.ceilingEntry(intervals[i].end);
			result[i] = (entry != null) ? entry.getValue() : -1;
		}
		return result;
	}
}
