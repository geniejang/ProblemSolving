package leetcode.no494_TargetSum;

public class Solution {
	public int findTargetSumWays(int[] nums, int S) {
		int n = (int) Math.pow(2, nums.length);
		int[] tree = new int[n];
		int nLv = 1;
		for (int num : nums) {
			for (int j = nLv - 1; j >= 0; j--) {
				tree[j * 2 + 1] = tree[j] + num;
				tree[j * 2] = tree[j] - num;
			}
			nLv <<= 1;
		}
		int cnt = 0;
		for (int sum : tree) {
			if (S == sum) {
				cnt++;
			}
		}
		return cnt;
		/**
		 * The counting code above could be replaced with the single line below using stream but slow.
		 * return (int) Arrays.stream(tree).filter(i -> i == S).count();
		 */
	}
}
