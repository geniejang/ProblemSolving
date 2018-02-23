package leetcode.no368_LargestDivisibleSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public List<Integer> largestDivisibleSubset(int[] nums) {
		if (nums == null || nums.length == 0) {
			return Collections.emptyList();
		}
		Arrays.sort(nums);
		int dp[] = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] % nums[j] == 0 && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		int maxIdx = 0;
		for (int i = 1; i < dp.length; i++) {
			if (dp[i] > dp[maxIdx]) {
				maxIdx = i;
			}
		}
		List<Integer> list = new ArrayList<>(dp[maxIdx] + 1);
		int n = nums[maxIdx];
		int cnt = dp[maxIdx];
		for (int i = maxIdx; cnt >= 0; i--) {
			if (n % nums[i] == 0 && cnt == dp[i]) {
				n = nums[i];
				list.add(n);
				cnt--;
			}
		}
		return list;
	}
}
