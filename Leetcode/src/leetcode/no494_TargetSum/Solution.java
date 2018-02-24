package leetcode.no494_TargetSum;

public class Solution {
	/**
	 * F(P): the sum of the numbers selected as positive from nums
	 * F(N): the sum of the numbers selected as negative from nums
	 * F(nums): the sum of nums (= F(P)+F(N) )
	 * S: target
	 * 
	 * Looking for
	 * ``` F(P) - F(N) = S ```
	 * 
	 * Add F(nums) to both sides.
	 * ``` F(P) - F(N) + F(nums) = S + F(nums) ```
	 * 
	 * Replace F(nums) on the right with F(P)+F(N)
	 * ``` F(P) - F(N) + F(P) + F(N) = S + F(nums) ```
	 * ``` 2 * F(P) = S + F(nums) ```
	 * 
	 * The partial sum of positives is twice of (S + F(nums))
	 * So, if F(nums) is less than S, or S+F(nums) is odd, there's no possible cases.
	 * 
	 * All the combinations of partial sum could be found by DP.
	 */
	public int findTargetSumWaysWithDP(int[] nums, int S) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		int posSum = (S + total);
		if (total < S || (posSum & 1) == 1) {
			return 0;
		}
		posSum >>= 1;
		int[] dp = new int[posSum + 1];
		dp[0] = 1;
		for (int num : nums) {
			for (int i = posSum; i >= num; i--) {
				dp[i] += dp[i - num];
			}
		}
		return dp[posSum];
	}

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
