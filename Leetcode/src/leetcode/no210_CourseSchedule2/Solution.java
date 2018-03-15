package leetcode.no210_CourseSchedule2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private static final byte NEVER = 0;
	private static final byte ING = 1;
	private static final byte DONE = 2;

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> map = new HashMap<>(prerequisites.length);
		for (int[] prerq : prerequisites) {
			List<Integer> list = map.get(prerq[1]);
			if (list == null) {
				list = new ArrayList<>();
				map.put(prerq[1], list);
			}
			list.add(prerq[0]);
		}
		Deque<Integer> stack = new ArrayDeque<>(numCourses);
		byte[] visited = new byte[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (!dfs(visited, i, map, stack)) {
				return new int[] {};
			}
		}
		int[] order = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			order[i] = stack.pop();
		}
		return order;
	}

	private boolean dfs(byte[] visited, int curr, Map<Integer, List<Integer>> map, Deque<Integer> stack) {
		if (visited[curr] != NEVER) {
			return visited[curr] == DONE;
		}
		visited[curr] = ING;
		for (int pre : map.getOrDefault(curr, Collections.emptyList())) {
			if (!dfs(visited, pre, map, stack)) {
				return false;
			}
		}
		visited[curr] = DONE;
		stack.push(curr);
		return true;
	}
}
