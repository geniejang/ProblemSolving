package leetcode.no406_QueueReconstructionByHeight;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[][] reconstructQueue(int[][] people) {
		int[][] reconstructed = Arrays.copyOf(people, people.length);
		Arrays.sort(reconstructed, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);
		List<int[]> list = new LinkedList<>();
		for (int[] item : reconstructed) {
			list.add(item[1], item);
		}
		return list.toArray(reconstructed);
	}
}
