package leetcode.no207_CourseSchedule;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private static final int ONGOING = 1;
	private static final int DONE = 2;

	private List<List<Integer>> links;
	private int[] visited;

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		links = new ArrayList<>(numCourses);
		for (int i = 0; i < numCourses; i++) {
			links.add(new ArrayList<>());
		}
		for (int[] prerequisite : prerequisites) {
			links.get(prerequisite[0]).add(prerequisite[1]);
		}
		visited = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (hasCycle(i)) {
				return false;
			}
		}
		return true;
	}

	private boolean hasCycle(int i) {
		if (visited[i] == ONGOING) {
			return true;
		} else if (visited[i] == DONE) {
			return false;
		}
		visited[i] = ONGOING;
		for (int l : links.get(i)) {
			if (hasCycle(l)) {
				return true;
			}
		}
		visited[i] = DONE;
		return false;
	}
}
