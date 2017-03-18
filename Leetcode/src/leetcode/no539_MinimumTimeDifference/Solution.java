package leetcode.no539_MinimumTimeDifference;

import java.util.Arrays;
import java.util.List;

public class Solution {
	private int getDigit(String t, int index) {
		return t.charAt(index) - '0';
	}

	private int convertToMinutes(String t) {
		return 60 * (getDigit(t, 0) * 10 + getDigit(t, 1)) + (getDigit(t, 3) * 10 + getDigit(t, 4));
	}

	private int diffInMinutes(int small, int big) {
		int diff = big - small;
		return Integer.min(diff, 24 * 60 - diff);
	}

	public int findMinDifference(List<String> timePoints) {
		int[] minutes = new int[timePoints.size()];
		int index = 0;
		for (String t : timePoints) {
			minutes[index++] = convertToMinutes(t);
		}
		Arrays.sort(minutes);
		int minDiff = diffInMinutes(minutes[0], minutes[minutes.length - 1]);
		for (int i = 0; i < minutes.length - 1; i++) {
			minDiff = Integer.min(minDiff, diffInMinutes(minutes[i], minutes[i + 1]));
		}
		return minDiff;
	}
}
