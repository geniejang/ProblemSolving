package leetcode.no744_FindSmallestLetterGreaterThanTarget;

public class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		int l = 0;
		int r = letters.length;
		while (l != r) {
			int pivot = (l + r) / 2;
			if (letters[pivot] <= target) {
				l = pivot + 1;
			} else {
				r = pivot;
			}
		}
		return letters[l % letters.length];
	}
}
