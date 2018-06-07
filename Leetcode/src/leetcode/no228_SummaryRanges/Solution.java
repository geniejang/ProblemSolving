package leetcode.no228_SummaryRanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	private void addRange(List<String> ranges, int start, int end) {
		if (start == end) {
			ranges.add(String.valueOf(start));
		} else {
			ranges.add(String.format("%d->%d", start, end));
		}
	}

	public List<String> summaryRanges(int[] nums) {
		if (nums.length == 0) {
			return Collections.emptyList();
		}
		int start = nums[0];
		int end = nums[0];
		List<String> ranges = new ArrayList<>();
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != end + 1) {
				addRange(ranges, start, end);
				start = nums[i];
			}
			end = nums[i];
		}
		addRange(ranges, start, end);
		return ranges;
	}
}
