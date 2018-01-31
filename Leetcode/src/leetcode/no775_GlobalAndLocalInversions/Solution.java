package leetcode.no775_GlobalAndLocalInversions;

public class Solution {
	public boolean isIdealPermutation(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int diff = A[i] - i;
			if (diff >= 2 || diff <= -2) {
				return false;
			}
		}
		return true;
	}
}
