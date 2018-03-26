package leetcode.no174_DungeonGame;

public class Solution {
	public int calculateMinimumHP(int[][] dungeon) {
		int min = 1;
		int max = Integer.MAX_VALUE;
		while (min < max) {
			int mid = min + ((max - min) >> 1);
			if (isReachable(dungeon, mid)) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		return min;
	}

	private boolean isReachable(int[][] dungeon, int hp) {
		int[] dp = new int[dungeon[0].length + 1];
		dp[1] = hp;
		for (int r = 0; r < dungeon.length; r++) {
			int cnt = 0;
			for (int c = 1; c < dp.length; c++) {
				if (dp[c - 1] > 0 || dp[c] > 0) {
					dp[c] = dungeon[r][c - 1] + Integer.max(dp[c - 1], dp[c]);
					cnt++;
				}
			}
			if (cnt == 0) {
				return false;
			}
		}
		return dp[dungeon[0].length] > 0;
	}
}
