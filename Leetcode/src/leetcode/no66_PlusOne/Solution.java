package leetcode.no66_PlusOne;

public class Solution {
	public int[] plusOne(int[] digits) {
		int index = digits.length - 1;
		while (index >= 0) {
			if (digits[index] == 9) {
				digits[index--] = 0;
			} else {
				digits[index]++;
				return digits;
			}
		}

		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
}
