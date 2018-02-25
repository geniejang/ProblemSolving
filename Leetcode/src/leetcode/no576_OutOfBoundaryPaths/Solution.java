package leetcode.no576_OutOfBoundaryPaths;

public class Solution {
	private static final int[][] DIRS = { { -1, 0 }, { +1, 0 }, { 0, -1 }, { 0, +1 } };
	private static final int MOD = 1000000007;

	/**
	 * Update the whole grid to N moves, and return (i, j)
	 */
	public int findPaths(int m, int n, int N, int i, int j) {
		if (N == 0) {
			return 0;
		}
		int[][][] dp = new int[m + 2][n + 2][N + 1];
		for (int r = 1; r <= m; r++) {
			dp[r][1][1]++;
			dp[r][n][1]++;
		}
		for (int c = 1; c <= n; c++) {
			dp[1][c][1]++;
			dp[m][c][1]++;
		}
		for (int moves = 2; moves <= N; moves++) {
			for (int r = 1; r <= m; r++) {
				for (int c = 1; c <= n; c++) {
					dp[r][c][moves] = dp[r][c][moves - 1];
					for (int[] DIR : DIRS) {
						dp[r][c][moves] += dp[r + DIR[0]][c + DIR[1]][moves - 1]
								- dp[r + DIR[0]][c + DIR[1]][moves - 2];
						if (dp[r][c][moves] < 0) {
							dp[r][c][moves] += MOD;
						}
						dp[r][c][moves] %= MOD;
					}
				}
			}
		}
		return dp[i + 1][j + 1][N];
	}

	/**
	 * Creeping out from (i, j) and count the out of boundary cases.
	 */
	public int findPaths2(int m, int n, int N, int i, int j) {
		int[][][] dp = new int[m][n][N + 1];
		dp[i][j][0] = 1;
		int out = 0;
		for (int moves = 1; moves <= N; moves++) {
			int left = Integer.max(0, j - moves);
			int right = Integer.min(n, j + moves);
			int upper = Integer.max(0, i - moves);
			int bottom = Integer.min(m, i + moves);
			for (int r = upper; r < bottom; r++) {
				for (int c = left; c < right; c++) {
					for (int[] DIR : DIRS) {
						int nR = r + DIR[0];
						int nC = c + DIR[1];
						if (nR < 0 || nR == m || nC < 0 || nC == n) {
							out += dp[r][c][moves - 1];
							out %= MOD;
						} else {
							dp[nR][nC][moves] += dp[r][c][moves - 1];
							dp[nR][nC][moves] %= MOD;
						}
					}
				}
			}
		}
		return out;
	}
}
