package leetcode.no721_AccountsMerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	List<List<String>> accountsMerge(List<List<String>> accounts) {
		int[] root = new int[accounts.size()];
		Arrays.setAll(root, i -> i);
		for (int i = 0; i < accounts.size(); i++) {
			List<String> acci = accounts.get(i);
			for (int j = i + 1; j < accounts.size(); j++) {
				List<String> accj = accounts.get(j);
				if (root[i] != root[j] && hasSameEmail(acci, accj)) {
					int update = root[j];
					for (int k = 0; k < root.length; k++) {
						if (root[k] == update) {
							root[k] = root[i];
						}
					}
				}
			}
		}
		Map<Integer, Set<String>> map = new HashMap<>();
		for (int i = 0; i < root.length; i++) {
			List<String> account = accounts.get(i);
			Set<String> set = map.get(root[i]);
			if (set == null) {
				set = new TreeSet<>();
				map.put(root[i], set);
			}
			for (int email = 1; email < account.size(); email++) {
				set.add(account.get(email));
			}
		}
		List<List<String>> merged = new ArrayList<>();
		for (Map.Entry<Integer, Set<String>> e : map.entrySet()) {
			List<String> account = new ArrayList<>();
			account.add(accounts.get(e.getKey()).get(0));
			account.addAll(e.getValue());
			merged.add(account);
		}
		return merged;
	}

	private boolean hasSameEmail(List<String> a, List<String> b) {
		for (int i = 1; i < a.size(); i++) {
			for (int j = 1; j < b.size(); j++) {
				if (a.get(i).equals(b.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
}
