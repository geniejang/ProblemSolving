package leetcode.no797_AllPathsFromSourceToTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> paths = new ArrayList<>();
		dfsBacktracking(graph, paths, new ArrayList<>(graph.length), 0);
		return paths;
	}

	private void dfsBacktracking(int[][] graph, List<List<Integer>> paths, List<Integer> path, int curr) {
		path.add(curr);
		if (curr == graph.length - 1) {
			paths.add(new ArrayList<>(path));
		} else {
			for (int to : graph[curr]) {
				dfsBacktracking(graph, paths, path, to);
			}
		}
		path.remove(path.size() - 1);
	}

	public List<List<Integer>> allPathsSourceTargetMem(int[][] graph) {
		Map<Integer, List<List<Integer>>> map = new HashMap<>();
		return dfsMem(graph, map, 0);
	}

	private List<List<Integer>> dfsMem(int[][] graph, Map<Integer, List<List<Integer>>> map, int curr) {
		List<List<Integer>> path = map.get(curr);
		if (path == null) {
			path = new ArrayList<>();
			if (curr == graph.length - 1) {
				path.add(Arrays.asList(curr));
			} else {
				for (int to : graph[curr]) {
					for (List<Integer> subpath : dfsMem(graph, map, to)) {
						List<Integer> newpath = new ArrayList<>();
						newpath.add(curr);
						newpath.addAll(subpath);
						path.add(newpath);
					}
				}
			}
			map.put(curr, path);
		}
		return path;
	}
}
