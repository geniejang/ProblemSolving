package leetcode.no022_GenerateParentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> generateParenthesis(int n) {
		Map<Integer, List<String>> dp = new HashMap<>(n + 1);
		dp.put(0, Arrays.asList(""));
		for (int i = 1; i <= n; i++) {
			List<String> list = new ArrayList<>();
			for (int j = 0; j < i; j++) {
				for (String in : dp.get(j)) {
					for (String right : dp.get(i - j - 1)) {
						list.add("(" + in + ")" + right);
					}
				}
			}
			dp.put(i, list);
		}
		return dp.get(n);
	}

	public List<String> generateParenthesisGrowing2dArray(int n) {
		String[][] dp = new String[n + 1][];
		dp[0] = new String[] { "" };
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				cnt += dp[j].length * dp[i - j - 1].length;
			}
			dp[i] = new String[cnt];
			int idx = 0;
			for (int j = 0; j < i; j++) {
				for (String in : dp[j]) {
					for (String right : dp[i - j - 1]) {
						dp[i][idx++] = "(" + in + ")" + right;
					}
				}
			}
		}
		return Arrays.asList(dp[n]);
	}
}
