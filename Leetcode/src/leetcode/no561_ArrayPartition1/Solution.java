package leetcode.no561_ArrayPartition1;

import java.util.Arrays;

public class Solution {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}

	public int arrayPairSumWithIndexCountingArray(int[] nums) {
		int[] count = new int[20001];
		for (int num : nums) {
			count[num + 10000]++;
		}
		int sum = 0;
		boolean oneMore = true;
		for (int i = 0; i < count.length; i++) {
			int cnt = count[i] >> 1;
			if ((count[i] & 1) != 0) {
				if (oneMore) {
					cnt++;
				}
				oneMore = !oneMore;
			}
			sum += cnt * (i - 10000);
		}
		return sum;
	}
}
