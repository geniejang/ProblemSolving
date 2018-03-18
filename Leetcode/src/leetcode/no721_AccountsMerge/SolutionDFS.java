package leetcode.no721_AccountsMerge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SolutionDFS {
	List<List<String>> accountsMerge(List<List<String>> accounts) {
		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < accounts.size(); i++) {
			List<String> acc = accounts.get(i);
			for (int j = 1; j < acc.size(); j++) {
				String email = acc.get(j);
				List<Integer> indicies = map.get(email);
				if (indicies == null) {
					indicies = new ArrayList<>();
					map.put(email, indicies);
				}
				indicies.add(i);
			}
		}
		List<List<String>> merged = new ArrayList<>();
		boolean[] visited = new boolean[accounts.size()];
		for (int i = 0; i < accounts.size(); i++) {
			if (!visited[i]) {
				Set<String> emails = new TreeSet<>();
				dfs(accounts, visited, map, i, emails);
				List<String> macc = new ArrayList<>();
				macc.add(accounts.get(i).get(0));
				macc.addAll(emails);
				merged.add(macc);
			}
		}
		return merged;
	}

	private void dfs(List<List<String>> accounts, boolean[] visited, Map<String, List<Integer>> map, int i,
			Set<String> emails) {
		if (!visited[i]) {
			visited[i] = true;
			List<String> account = accounts.get(i);
			for (int e = 1; e < account.size(); e++) {
				String email = account.get(e);
				emails.add(email);
				for (int idx : map.getOrDefault(email, Collections.emptyList())) {
					dfs(accounts, visited, map, idx, emails);
				}
			}
		}
	}
}
