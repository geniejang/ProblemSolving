package leetcode.no485_MaxConsecutiveOnes;

public class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int maximum = 0;
		int current = 0;
		if (nums == null)
			return 0;

		for (int num : nums) {
			if (num == 0)
				current = 0;
			if (num == 1)
				current++;
			if (current > maximum)
				maximum = current;
		}

		return maximum;
	}
}
